package aosp.changesets.statistics

import com.fasterxml.jackson.core.type.TypeReference
import java.io.File

fun main() {
    val emailDomainToChangesetNum = mutableMapOf<String, Long>()
    val emailDomainToInsertionNum = mutableMapOf<String, Long>()
    val emailDomainToDeletionNum = mutableMapOf<String, Long>()
    val emailDomainToInsertionDeletionNum = mutableMapOf<String, Long>()

    File("build").listFiles().forEach {
        if (!it.name.endsWith(".json")) {
            return@forEach
        }
        val changesets = objectMapper.readValue(it, object : TypeReference<List<Changeset>>() {})
        for (changeset in changesets) {
            val emailDomain = changeset.submitter?.email?.substringAfter("@") ?: changeset.owner?.email?.substringAfter("@") ?: continue

            val changesetNum = emailDomainToChangesetNum[emailDomain] ?: 0
            val insertion = emailDomainToInsertionNum[emailDomain] ?: 0
            val deletion = emailDomainToDeletionNum[emailDomain] ?: 0
            val insertionDeletion = emailDomainToInsertionDeletionNum[emailDomain] ?: 0

            val insertionOfCurrentChangeSet = if (changeset.insertions != null) changeset.insertions else 0
            val deletionOfCurrentChangeSet = if (changeset.deletions != null) changeset.deletions else 0

            emailDomainToChangesetNum[emailDomain] = changesetNum + 1
            emailDomainToInsertionNum[emailDomain] = insertion + insertionOfCurrentChangeSet
            emailDomainToDeletionNum[emailDomain] = deletion + deletionOfCurrentChangeSet
            emailDomainToInsertionDeletionNum[emailDomain] = insertionDeletion + deletionOfCurrentChangeSet + insertionOfCurrentChangeSet
        }
    }
    println("domain by changeset number:")
    emailDomainToChangesetNum.toCsv()
    println("---------------")

    println("domain by insertion:")
    emailDomainToInsertionNum.toCsv()
    println("---------------")

    println("domain by deletion:")
    emailDomainToDeletionNum.toCsv()
    println("---------------")

    println("domain by insertion+deletion:")
    emailDomainToInsertionDeletionNum.toCsv()
    println("---------------")
}

fun MutableMap<String, Long>.toCsv() {
    entries.sortedByDescending { it.value }
        .forEach { println("${it.key}, ${it.value}") }
}