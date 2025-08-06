pluginManagement {
    val javafxPluginVersion: String by settings
    plugins {
        id("org.openjfx.javafxplugin").version(javafxPluginVersion)
    }
}

rootProject.name = "idle-game-generator-visualization-tool"