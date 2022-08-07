@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("mydeps") {
            from(files("gradle/mydeps.versions.toml"))
        }
    }
}
enableFeaturePreview("VERSION_CATALOGS")
rootProject.name = "Jetpack Compose Extensions"
include(":library")