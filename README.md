# Jetpack Compose Extensions

[![](https://jitpack.io/v/BalbekovAD/JetpackComposeExtensions.svg)](https://jitpack.io/#BalbekovAD/JetpackComposeExtensions)

My handy library that contains some convenient and short overloads for Jetpack Compose

[Тот же текст но на русском(Same text but in Russian)](/README(ru).md)

This small library was created in order to simplify the Compose code that you write.
To do this, it adds several overloads for basic Composable functions, namely: remember, Text, Icon.

In the future, I plan to add documentation here for all functions.

# Setup

* First, you need to add the JitPack Repository to your project. To do this, add this line of code to your
  settings.gradle(.kts) file.

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
    maven("https://jitpack.io")
  }
  ```

* Second, add library dependency itself.

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

# Documentation

* ### ```Text(...)``` and ```Icon(...)``` overloads to avoid writing ```stringResource(...)```
  
  ```kotlin
  Text(text = R.string.welcome_text)
  ```
  
  ```kotlin
  Icon(
      icon = Icons.Default.ExitApp,
      contentDescription = R.string.exit_app_icon_description
  )
  ```
  
* ### More compact version of ```remember { mutableStateOf(...) }```
  
  ```kotlin
  val fieldValue by rememberMutableStateOf(value = 666)
  ```
