# Jetpack Compose Extensions

Моя маленькая библиотека, которая содержит несколько маленьких и удобных перегрузок для Jetpack
Compose

[Same text but in English(Тот же текст но на английском)](/README.md)

Эта маленькая библиотека была создана, для того чтобы упростить Compose код, который вы пишете.
Для этого она добавляет несколько перегрузок для базовых Composable функций, а именно: remember,
Text, Icon.

В дальнейшем планирую добавить здесь документацию для всех функций.

[//]: # (TODO Задокументировать все функции)

# Setup

1. **Сначала вам нужно добавить JitPack репозиторий в свой проект. Для этого добавьте эту строчку в ваш
   settings.gradle(.kts) file.**
   
   *Groovy (\*.gradle)*
    ```groovy
    repository {
        jcenter()
        mavenCentral()
        ...
        maven { url 'https://jitpack.io' }
    }
   ```
   *Kotlin (\*.gradle.kts)*

    ```kotlin
    repository {
        jcenter()
        mavenCentral()
        ...
        maven { url = URI.create("https://jitpack.io") }
    }
    ```
2. **Потом добавьте зависимость самой библиотеки.**

   *Groovy (\*.gradle)*
    ```groovy
    dependencies {
        implementation "com.github.BalbekovAD:JetpackComposeExtensions:$last_version"
    }
   ```
   *Kotlin (\*.gradle.kts)*

    ```kotlin
    dependencies {
        implementation("com.github.BalbekovAD:JetpackComposeExtensions:$last_version")
    }
    ```