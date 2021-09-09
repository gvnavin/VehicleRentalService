import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
    application
}

group = "me.gnavin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.testng:testng:7.4.0")
    // https://mvnrepository.com/artifact/org.powermock/powermock-module-testng
    testImplementation("org.powermock:powermock-module-testng:2.0.9")
    // https://mvnrepository.com/artifact/org.mockito/mockito-testng
    testImplementation("org.mockito:mockito-testng:0.4.13")
}

tasks.test {
    useTestNG()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}
