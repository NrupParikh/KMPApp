# Kotlin Multiplatform app

- This is a basic Kotlin Multiplatform app template for Android and iOS.
- It includes shared business logic and data handling, and a shared UI implementation using Compose Multiplatform.

### Technologies

The data displayed by the app is from [The Metropolitan Museum of Art Collection API](https://metmuseum.github.io/).

The app uses the following multiplatform dependencies in its implementation:

- [Compose Multiplatform](https://jb.gg/compose) for UI
- [Ktor](https://ktor.io/) for networking
- [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) for JSON handling
- [Kamel](https://github.com/Kamel-Media/Kamel) for image loading
- [moko-resources](https://github.com/icerockdev/moko-resources) for string,color,assets,font,file resources
- [Koin](https://github.com/InsertKoinIO/koin) for dependency injection
- [Voyager](https://github.com/adrielcafe/voyager) for navigation and screen models

### Koin vs Hilt
- Koin written in Kotlin while Hilt written in Java
- It is checked at run time while Hilt is checked at compile time
- No code generation at build time. so, it build faster while in Hilt, code generation done at build time.