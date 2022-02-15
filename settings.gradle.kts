rootProject.name = "RadiantsToDegrees"
include(":app")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    versionCatalogs {
        create("libs") {
            from(files("versions.toml"))
        }
    }
    repositories {
        google()
        mavenCentral()
    }
}

include(":utils")
