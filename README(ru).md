# Jetpack Compose Extensions

Моя маленькая библиотека, которая содержит несколько маленьких и удобных перегрузок для Jetpack
Compose

[Same text but in English(Тот же текст но на английском)](README.md)

Эта маленькая библиотека была создана, для того чтобы упростить Compose код, который вы пишете.
Для этого она добавляет несколько перегрузок для базовых Composable функций, а именно: remember,
Text, Icon.

# Подключение библиотеки

* Сначала вам нужно добавить JitPack репозиторий в свой проект. Для этого добавьте эту строчку в ваш
  settings.gradle(.kts) file

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
* Потом добавьте зависимость самой библиотеки

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

# Документация

* ### В ```Text(...)``` и ```Icon(...)``` можно не писать```stringResource(...)```

  ```kotlin
  Text(R.string.welcome_text)
  ```
  ```kotlin
  Icon(Icons.Default.ExitApp, R.string.exit_app_icon_description)
  ```

* ### Более компактная версия ```remember { mutableStateOf(...) }```

  ```kotlin
  val fieldValue by rememberMutableStateOf(666)
  ```
* ### Более компактная версия ```remember { derivedStateOf(...) }```

  ```kotlin
  val fieldValue by rememberDerivedStateOf(value1, value2) { ... }
  ```

* ### Более компактные версия `Lazy*For(...)` и `Lazy*ForIndexed(...)`
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