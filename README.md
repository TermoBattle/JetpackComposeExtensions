# Jetpack Compose Extensions

[![](https://jitpack.io/v/BalbekovAD/JetpackComposeExtensions.svg)](https://jitpack.io/#BalbekovAD/JetpackComposeExtensions)

My handy library that contains some convenient and short overloads for Jetpack Compose

[Тот же текст но на русском(Same text but in Russian)](/README(ru).md)

This small library was created in order to simplify the Compose code that you write.
To do this, it adds several overloads for basic Composable functions, namely: remember, Text, Icon.

In the future, I plan to add documentation here for all functions.

# Setup

* First, you need to add the JitPack repository to your project.
  To do this, add this line to your settings.gradle(.kts) file

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
* Then add the dependency of the library itself

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

* ### In ```Text(...)``` and ```Icon(...)``` you can now not write ```stringResource(...)```

  ```kotlin
  Text(R.string.welcome_text)
  ```
  ```kotlin
  Icon(Icons.Default.ExitApp, R.string.exit_app_icon_description)
  ```

* ### More compact version of ```remember { mutableStateOf(...) }```

  ```kotlin
  val fieldValue by rememberMutableStateOf(666)
  ```
* ### More compact version of ```remember { derivedStateOf(...) }```

  ```kotlin
  val fieldValue by rememberDerivedStateOf(value1, value2) { ... }
  ```

* ### More compact versions of `Lazy*For(...)` and `Lazy*ForIndexed(...)`
  ```kotlin
  LazyColumnFor(personsList) {
      Text(it.toString())
  }
  ```
  ```kotlin
  LazyRowForIndexed(personsList) { index, person ->
      SomeComposable(person, index)
  }
  ```