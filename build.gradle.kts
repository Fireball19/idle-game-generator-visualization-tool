plugins {
    java
    application
    alias(libs.plugins.javafx)
}

version = "${property("appVersion")}"
description = "A tool to help balance your idle games."

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jackson.databind)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.assertj.core)
    testRuntimeOnly(libs.junit.platform.launcher)
}

application {
    mainClass = "idle.game.generator.visualization.tool.GeneratorVisualizationTool"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.java.get())
    }
}

javafx {
    version = libs.versions.java.get()
    modules = listOf("javafx.controls")
}

tasks.withType<Test> {
	useJUnitPlatform()
}