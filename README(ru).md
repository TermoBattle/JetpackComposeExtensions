# Jetpack Compose Extensions

Моя маленькая библиотека, которая содержит несколько маленьких и удобных перегрузок для Jetpack
Compose

[Same text but in English(Тот же текст но на английском)](README.md)

Эта маленькая библиотека была создана, для того чтобы упростить Compose код, который вы пишете.
Для этого она добавляет несколько перегрузок для базовых Composable функций, а именно: remember,
Text, Icon.

# Подключение библиотеки

1. Сначала вам нужно добавить JitPack репозиторий в свой проект. Для этого добавьте эту строчку в ваш
   settings.gradle(.kts) file

   *Groovy (\*.gradle)*
    ```groovy
    repository {
        jcenter()
        mavenCentral()
//        ...
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
2. Потом добавьте зависимость самой библиотеки

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

### Перегрузки ```Text(...)``` и ```Icon(...)``` чтобы не писать```stringResource(...)```

```kotlin
Text(text = R.string.welcome_text)
```

```kotlin
Icon(
    icon = Icons.Default.ExitApp,
    contentDescription = R.string.exit_app_icon_description
)
```

### Более компактная версия ```remember { mutableStateOf(...) }```
```kotlin
val fieldValue by rememberMutableStateOf(value = 666)
```
* ### Перегрузки `Lazy*For(...)` и `Lazy*ForIndexed(...)`
  *До:*
  ```kotlin
  LazyColumn{
      items(...){
          ...
      }
  }
  ```
  *После:*
  ```kotlin
    LazyColumnFor(...){
        ...
    }
  ```
  *До:*
  ```kotlin
  LazyRow{
      itemsIndexed(...){
          ...
      }
  }
  ```
  *После:*
  ```kotlin
    LazyRowForIndexed(...){
        ...
    }
  ```