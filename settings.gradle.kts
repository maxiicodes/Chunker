pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("./offline-repository")
        }
    }
}

rootProject.name = "chunker"

include("cli", "app")