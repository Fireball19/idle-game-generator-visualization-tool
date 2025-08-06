plugins {
    java
    application
	id("org.openjfx.javafxplugin")
}

version = "${property("appVersion")}"
description = "A tool to help balance your idle games."

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:${property("jacksonDatabindVersion")}")

    testImplementation("org.junit.jupiter:junit-jupiter:${property("junitJupiterVersion")}")
    testImplementation("org.assertj:assertj-core:${property("assertjVersion")}")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:${property("junitPlatformVersion")}")
}

application {
    mainClass = "idle.game.generator.visualization.tool.GeneratorVisualizationTool"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of("${property("javaVersion")}")
    }
}

javafx {
    version = "${property("javaVersion")}"
    modules = listOf<String>("javafx.controls")
}

tasks.withType<Test> {
	useJUnitPlatform()
}