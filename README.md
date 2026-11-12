<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0%3A2B1055%2C50%3A7F52FF%2C100%3AE0D4FF&height=200&section=header&text=Repositorio+Interactivo&fontSize=60&fontColor=fff&fontAlignY=38&desc=Colecci%C3%B3n+de+mini-proyectos+en+Android+Compose&descAlignY=62&descSize=18" width="100%"/>
</div>

<div align="center">
  <a href="https://github.com/evagr11/RepositorioInteractivo/releases/latest" target="_blank">
    <img src="https://img.shields.io/badge/Descargar_APK-7F52FF?style=for-the-badge&logo=android&logoColor=white" alt="Descargar APK">
  </a>
  <a href="https://github.com/evagr11/RepositorioInteractivo" target="_blank">
    <img src="https://img.shields.io/badge/Ver_Código-2B1055?style=for-the-badge&logo=github&logoColor=white" alt="Ver Código">
  </a>
  <a href="docs/Documentacion_RepositorioInteractivo.pdf" target="_blank">
    <img src="https://img.shields.io/badge/Documentación-7F52FF?style=for-the-badge&logo=latex&logoColor=white" alt="Documentación">
  </a>
  <a href="https://evagr11.github.io/Curriculum/proyectos/repositorio-interactivo.html" target="_blank">
    <img src="https://img.shields.io/badge/Ver_Web-2B1055?style=for-the-badge&logo=googlechrome&logoColor=white" alt="Ver Web">
  </a>
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android">
  <img src="https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose">
  <img src="https://img.shields.io/badge/Status-Estable-brightgreen?style=for-the-badge" alt="Status Estable">
</div>

<br>

<div align="center">
  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com/?font=JetBrains+Mono&size=18&duration=3500&pause=800&color=7F52FF&center=true&vCenter=true&width=600&lines=Aplicaci%C3%B3n+Android+nativa+con+Kotlin%3BInterfaz+declarativa+con+Jetpack+Compose%3B6+mini-proyectos+en+una+sola+app%3BViewModel+y+StateFlow%3BComponentes+de+Material+3" alt="Typing SVG" /></a>
</div>

<div align="center">
  <img src=".github/readme/Mockup.jpg" alt="Mockup de Repositorio Interactivo: un móvil con la Limonada y tres móviles con la calculadora de propinas, el login y el login con ViewModel" width="100%"/>
</div>

# 🚀 Sobre el Proyecto

**Repositorio Interactivo** es una aplicación para Android que agrupa una colección de **mini-proyectos de ejemplo**, diseñados para explorar y demostrar diversas funcionalidades de desarrollo nativo moderno con **Kotlin y Jetpack Compose**. Cada mini-proyecto es una `Activity` independiente que se abre desde una pantalla principal, y cada uno practica algo distinto: campos de texto, estado, listas, validación de formularios o ViewModel.

✨ **Características principales:**

*   **🏠 Menú central**: Un carrusel horizontal (`LazyRow`) con una tarjeta por mini-proyecto. Cada tarjeta guarda la `Activity` de destino y la abre con un `Intent`, así que añadir un proyecto nuevo es añadir una línea a `MisProyectos`.
*   **💵 Calculadora de propinas**: Calcula la propina según la cantidad y el porcentaje (15 % si no se indica) y la muestra con el formato de moneda del dispositivo (`NumberFormat`).
*   **🍋 Limonada**: Cuatro pasos (coger el limón, exprimirlo, beberse la limonada y empezar de nuevo) que cambian de imagen y texto según el estado.
*   **🔒 Login**: Formulario con usuario y contraseña oculta que avisa con un `Toast` si falta algún campo.
*   **🖼️ Galería**: `LazyColumn` de tarjetas con imagen y nombre, cargadas desde recursos (`@DrawableRes`, `@StringRes`).
*   **📝 Test de 10 preguntas**: Usa una clase **genérica** `Pregunta<T>` para mezclar respuestas de tipo `Boolean`, `Int`, `Double` y `String`, y comprueba cada una con su tipo antes de dar la puntuación.
*   **🧠 Login con ViewModel**: El mismo login, pero con el estado en un `ViewModel` expuesto como `StateFlow` (`UIState`), que es el patrón recomendado por Google.

### 📸 Galería

<table align="center">
  <tr>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/propinas.png" alt="Calculadora de propinas" width="180"/><br><sub><b>Propinas</b></sub></td>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/btn_dinamicos.png" alt="Limonada: limonero con el botón Siguiente" width="180"/><br><sub><b>Limonada</b></sub></td>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/login.png" alt="Login básico con aviso de login correcto" width="180"/><br><sub><b>Login</b></sub></td>
  </tr>
  <tr>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/galeria.png" alt="Galería de tarjetas con imagen y nombre" width="180"/><br><sub><b>Galería</b></sub></td>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/formulario.png" alt="Test de preguntas con el botón Finalizar Test" width="180"/><br><sub><b>Test</b></sub></td>
    <td align="center"><img src="app/src/main/res/drawable-nodpi/login_avanzado.png" alt="Login con ViewModel que saluda al usuario" width="180"/><br><sub><b>Login con ViewModel</b></sub></td>
  </tr>
</table>

# 🧠 Contexto del Proyecto

Este proyecto fue desarrollado como una iniciativa personal de aprendizaje y práctica. El objetivo principal era consolidar conocimientos en el desarrollo de aplicaciones para Android utilizando el paradigma moderno de UI declarativa con **Jetpack Compose** y las mejores prácticas de arquitectura recomendadas por Google, como el uso de **ViewModel** y **StateFlow** para desacoplar la lógica de la UI.

# 🛠️ Stack Tecnológico

| Tecnología | Descripción |
| :--- | :--- |
| **Lenguaje** | `Kotlin` |
| **Framework UI** | `Jetpack Compose` (con `Material 3`) |
| **Plataforma** | `Android SDK` (minSdk 24 · targetSdk 36) |
| **Arquitectura** | `MVVM` (Model-View-ViewModel) con `StateFlow` para la gestión de estado reactivo. |
| **Build System** | `Gradle` (con scripts en Kotlin `build.gradle.kts`) |
| **Documentación** | `LaTeX` (PDF en `docs/`) |
| **Distribución** | APK firmada en GitHub Releases |
| **Dependencias Clave** | `androidx.activity:activity-compose`, `androidx.compose.material3`, `androidx.lifecycle:lifecycle-runtime-ktx` |

# 📂 Estructura del Proyecto

El repositorio está organizado siguiendo la estructura estándar de un proyecto de Android, con una clara separación de responsabilidades para cada mini-aplicación.

```bash
RepositorioInteractivo/
└── app/
    ├── build.gradle.kts     # Configuración de build del módulo app
    └── src/
        └── main/
            ├── AndroidManifest.xml  # Registro de Activities y permisos
            ├── java/com/evagr/proyectitosinteractivos/
            │   ├── data/            # Proyecto.kt y MisProyectos.kt (la lista del menú)
            │   ├── proyectos/
            │   │   ├── proyecto1/   # Calculadora de Propinas
            │   │   ├── proyecto2/   # Limonada
            │   │   ├── proyecto3/   # Login Básico
            │   │   ├── proyecto4/   # Galería de imágenes
            │   │   ├── proyecto5/   # Test con la clase genérica Pregunta<T>
            │   │   └── proyecto6/   # Login Avanzado con ViewModel
            │   └── ui/
            │       └── theme/       # Configuración del tema de Compose y Home.kt
            └── res/
                ├── drawable-nodpi/  # Imágenes de las tarjetas y de los proyectos
                ├── values/          # Strings, colores, temas XML
                └── ...
docs/
└── Documentacion_RepositorioInteractivo.pdf  # Documentación técnica en LaTeX
.github/readme/                    # Mockup de este README
```

# 🚀 Cómo Utilizar el Proyecto

### 📲 Instalar la APK

La forma más rápida de probar la app es instalar la APK de la última versión, en [Releases](https://github.com/evagr11/RepositorioInteractivo/releases/latest):

1.  Descarga el archivo `.apk` desde el móvil.
2.  Ábrelo y, si Android lo pide, permite **instalar aplicaciones de orígenes desconocidos**.
3.  Pulsa **Instalar** y abre **Repositorio Interactivo**.

> Necesita **Android 7.0 (API 24)** o superior. No usa internet.

### 🧑‍💻 Compilar desde el código

Para ejecutarlo necesitas **Android Studio**.

1.  **Clona el repositorio:**
    ```bash
    git clone https://github.com/evagr11/RepositorioInteractivo.git
    ```
2.  **Abre el proyecto en Android Studio:** `File` > `Open` y selecciona la carpeta `RepositorioInteractivo`.
3.  **Sincroniza Gradle** y espera a que descargue las dependencias.
4.  Ejecuta la app en un emulador o en un móvil con `Run 'app'` y elige un mini-proyecto en el carrusel.

# 🎯 Mejoras futuras

- 🎨 Terminar los ajustes visuales que quedaron pendientes y dar a todos los mini-proyectos el mismo estilo.
- 🧭 Pasar de una `Activity` por mini-proyecto a una sola con **Navigation Compose**.
- 🧠 Llevar el estado de más mini-proyectos a un `ViewModel`, como en el login avanzado.
- 🧪 Añadir tests de la lógica (propinas y corrección del test).

<br>

<div align="center">
  <p>Creado por <strong>Eva Gallardo</strong></p>
  <a href="https://github.com/evagr11" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
  </a>
  <a href="https://www.linkedin.com/in/eva-gallardo-romero-830362349/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
  </a>
</div>

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0%3A2B1055%2C50%3A7F52FF%2C100%3AE0D4FF&height=120&section=footer" width="100%"/>
</div>
