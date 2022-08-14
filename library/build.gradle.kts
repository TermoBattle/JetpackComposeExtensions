@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "ru.ad.balbekov.library"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
//        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles = "consumer-rules.pro"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        @Suppress("SuspiciousCollectionReassignment")
        freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn" + "-Xuse-k2"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = mydeps.versions.kotlinCompilerExtension.get()
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    mydeps.run {
        implementation(core)
        implementation(appcompat)
        implementation(compose.ui)
        implementation(compose.ui.tooling)
        implementation(compose.foundation)
        implementation(compose.material3)
    }
}
afterEvaluate {
    publishing {
        publications {
            register("release", MavenPublication::class) {
                from(components["release"])
                groupId = "com.github.BalbekovAD"
                artifactId = "JetpackComposeExtensions"
                version = "1.1"
            }
        }
    }
}