plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.31"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.core:jackson-core:2.12.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.2")
}

application {
    // Define the main class for the application.
    mainClass.set("aosp.changesets.statistics.AppKt")
}

tasks.named<JavaExec>("run") {
    if (System.getProperty("since") != null) {
        jvmArgs("-Dsince=${System.getProperty("since")}")
    }
}

tasks.register<JavaExec>("analyze") {
    mustRunAfter("run")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("aosp.changesets.statistics.EmailDomainAnalysisKt")
}