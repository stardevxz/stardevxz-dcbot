import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
}

group = "dev.starxz.stardevxz-dcbot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
    maven(url = "https://m2.dv8tion.net/releases")
}

dependencies {
    implementation("com.github.DV8FromtheWorld:JDA:v5.0.0-beta.2")
    implementation("com.sedmelluq:lavaplayer:1.3.77")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}