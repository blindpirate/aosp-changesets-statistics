package aosp.changesets.statistics

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.net.URI
import java.net.URLEncoder
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.charset.StandardCharsets
import java.time.LocalDate

val cookie = "G_ENABLED_IDPS=google; _ga=GA1.2.1732494902.1615457523; _gid=GA1.2.1254773446.1615457523"
val userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.182 Safari/537.36"
val defaultPageSize = 100

fun main() {
    val sinceDate = LocalDate.parse(System.clearProperty("since") ?: throw IllegalArgumentException("You must set -Dsince=yyyy-MM-dd!"))
    var current = sinceDate
    while (current <= LocalDate.now()) {
        if (!dateFinished(current)) {
            try {
                queryAndSave(current)
            } catch (e: Exception) {
                // Sometimes there're too many data (>10000) at a single day.
                if (e.message?.contains("retcode: 400") == true) {
                    for (i in 0 until 24) {
                        queryAndSave(current, String.format("%02d", i), String.format("%02d", i))
                    }
                }
            }
        } else {
            println("Skip processed $current")
        }
        current = current.plusDays(1)
    }
}

fun dateFinished(date: LocalDate): Boolean {
    return File("build/$date.json").exists() || IntRange(0, 23).all {
        File("build/$date-${String.format("%02d", it)}-${String.format("%02d", it)}.json").exists()
    }
}

val objectMapper = ObjectMapper()
fun queryAndSave(date: LocalDate, startHour: String = "00", endHour: String = "23"  /* 00 - 23 */) {
    val file = if (startHour == "00" && endHour == "23")
        File("build/$date.json")
    else
        File("build/$date-$startHour-$endHour.json")

    val changesetsOfDay = mutableListOf<Changeset>()
    var cursor = 0
    while (true) {
        val url = buildUrl(cursor, defaultPageSize, date, startHour, endHour)
        // )]}'\n[{"id":
        val json = request(url).substringAfter("\n")
        val changesets = objectMapper.readValue(json, object : TypeReference<List<Changeset>>() {})
        if (changesets.isEmpty()) {
            break
        }
        println("Fetched data from $cursor at $date $startHour:00:00-$endHour:59:59")
        changesetsOfDay.addAll(changesets)
        cursor += defaultPageSize
    }
    file.writeText(objectMapper.writeValueAsString(changesetsOfDay))
    println("Saved ${changesetsOfDay.size} changesets to ${file.absolutePath}")
}

// https://stackoverflow.com/questions/45084860/query-past-the-500-limit-in-gerrit-rest-api
fun buildUrl(start: Int, pageSize: Int, date: LocalDate, startHour: String = "00", endHour: String = "23"): String {
    val query = URLEncoder.encode("after:{$date $startHour:00:00.000} AND before:{$date $endHour:59:99.999}", StandardCharsets.UTF_8)
    return "https://android-review.googlesource.com/changes/?O=81&S=$start&n=${pageSize}&q=$query"
}

fun request(url: String): String {
    val client = HttpClient.newBuilder()
        .followRedirects(HttpClient.Redirect.ALWAYS)
        .build()

    val request = HttpRequest.newBuilder()
        .header("cookie", cookie)
        .header("user-agent", userAgent)
        .header("accept", "*/*")
        .uri(URI.create(url))
        .build()

    val response = client.send(request, HttpResponse.BodyHandlers.ofString())
    require(response.statusCode() in 200..399) {
        "url: $url retcode: ${response.statusCode()}"
    }
    return response.body()
}
