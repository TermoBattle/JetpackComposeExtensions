buildscript {
    dependencies {
        classpath(mydeps.detektGradlePlugin)
    }
}// Top-level build file where you can add configuration options common to all subprojects/modules.
plugins {
    id("com.android.application") version "7.4.0-alpha09" apply false
    id("com.android.library") version "7.4.0-alpha09" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false

    id("com.github.ben-manes.versions") version "0.42.0"
    id("io.gitlab.arturbosch.detekt") version "1.21.0" apply true
}

detekt {
    toolVersion = "1.21.0"
    config = files("config/detekt/detekt.yml")
    buildUponDefaultConfig = true
}
dependencies {
    detektPlugins(mydeps.detektRulesCompose)
}