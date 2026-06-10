<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0%3A105c11%2C50%3A39c926%2C100%3Addf3dd&height=200&section=header&text=Repositorio+Interactivo&fontSize=60&fontColor=fff&fontAlignY=38&desc=Colecci%C3%B3n+de+mini-proyectos+en+Android+Compose&descAlignY=62&descSize=18" width="100%"/>
</div>

<div align="center">
  <a href="https://github.com/evagr11/RepositorioInteractivo">
    <img src="https://img.shields.io/badge/Ver_Código-2ea44f?style=for-the-badge&logo=github&logoColor=white" alt="Ver Código">
  </a>
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android">
  <img src="https://img.shields.io/badge/Jetpack_Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose">
  <img src="https://img.shields.io/badge/Status-Estable-brightgreen?style=for-the-badge" alt="Status Estable">
</div>

<br>

<div align="center">
  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com/?font=JetBrains+Mono&size=18&duration=3500&pause=800&color=31c926&center=true&vCenter=true&width=600&lines=Aplicaci%C3%B3n+Android+nativa+con+Kotlin%3BInterfaz+declarativa+con+Jetpack+Compose%3BArquitectura+MVVM+con+ViewModel+y+StateFlow%3BColecci%C3%B3n+de+mini-proyectos+interactivos%3BUso+de+Componentes+de+Material+3" alt="Typing SVG" /></a>
</div>

<!-- TODO: mockup o screenshot de la pantalla principal de la app -->

# 🚀 Sobre el Proyecto

**Repositorio Interactivo** es una aplicación para Android que agrupa una colección de **mini-proyectos de ejemplo**, diseñados para explorar y demostrar diversas funcionalidades de desarrollo nativo moderno con **Kotlin y Jetpack Compose**. Cada mini-proyecto es una actividad independiente accesible desde una pantalla principal, permitiendo experimentar con componentes de UI, gestión de estado y navegación.

✨ **Características principales:**
*   **🏠 Navegación Centralizada**: Una pantalla de inicio con un carrusel (`LazyRow`) que presenta cada mini-proyecto con una tarjeta visual y un botón de acceso.
*   **💵 Calculadora de Propinas**: Una utilidad simple para calcular la propina basada en el total de la cuenta y un porcentaje personalizable.
*   **🍋 Limonada Interactiva**: Un componente lúdico y con estado que guía al usuario a través de los pasos para hacer limonada, demostrando la gestión de estado (`State`).
*   **🔒 Formularios de Login**: Dos versiones de un formulario de inicio de sesión. Uno básico con validación simple y otro avanzado que utiliza un `ViewModel` y `StateFlow` para una gestión de estado más robusta.
*   **🖼️ Galería de Imágenes**: Una lista vertical (`LazyColumn`) que muestra imágenes y descripciones en tarjetas, cargando datos desde recursos locales.
*   **📝 Test de Conocimientos**: Un formulario interactivo tipo quiz con preguntas de distintos tipos de datos que valida las respuestas y muestra una puntuación final.

# 🧠 Contexto del Proyecto

Este proyecto fue desarrollado como una iniciativa personal de aprendizaje y práctica. El objetivo principal era consolidar conocimientos en el desarrollo de aplicaciones para Android utilizando el paradigma moderno de UI declarativa con **Jetpack Compose** y las mejores prácticas de arquitectura recomendadas por Google, como el uso de **ViewModel** y **StateFlow** para desacoplar la lógica de la UI.

# 🛠️ Stack Tecnológico

| Tecnología | Descripción |
| :--- | :--- |
| **Lenguaje** | `Kotlin` |
| **Framework UI** | `Jetpack Compose` (con `Material 3`) |
| **Plataforma** | `Android SDK` |
| **Arquitectura** | `MVVM` (Model-View-ViewModel) con `StateFlow` para la gestión de estado reactivo. |
| **Build System** | `Gradle` (con scripts en Kotlin `build.gradle.kts`) |
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
            │   ├── data/            # Clases de datos (Proyecto.kt, etc.)
            │   ├── proyectos/
            │   │   ├── proyecto1/   # Calculadora de Propinas
            │   │   ├── proyecto2/   # Botones Interactivos (Limonada)
            │   │   ├── proyecto3/   # Login Básico
            │   │   ├── proyecto4/   # Galería de Imágenes
            │   │   ├── proyecto5/   # Formulario/Test
            │   │   └── proyecto6/   # Login Avanzado con ViewModel
            │   └── ui/
            │       └── theme/       # Configuración del tema de Compose y Home.kt
            └── res/
                ├── drawable/        # Recursos gráficos (imágenes, iconos)
                ├── values/          # Strings, colores, temas XML
                └── ...
```

# 🚀 Cómo Utilizar el Proyecto

Para ejecutar este proyecto en tu entorno local, necesitarás **Android Studio** (versión recomendada: Hedgehog o posterior).

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/evagr11/RepositorioInteractivo.git
    ```

2.  **Abrir el proyecto en Android Studio:**
    *   En la pantalla de bienvenida de Android Studio, selecciona "**Open**".
    *   Navega hasta la carpeta `RepositorioInteractivo` que acabas de clonar y selecciónala.

3.  **Sincronizar Gradle:**
    *   Android Studio detectará automáticamente los archivos `build.gradle.kts` y comenzará a sincronizar el proyecto y a descargar las dependencias necesarias. Espera a que este proceso finalice.

4.  **Ejecutar la aplicación:**
    *   Selecciona un emulador de Android o conecta un dispositivo físico.
    *   Haz clic en el botón de **Run 'app'** (icono de play verde ▶️) en la barra de herramientas superior.

<!-- TODO: añadir una galería de screenshots mostrando cada uno de los mini-proyectos -->
<div align="center">
    <p><em>Ejecuta la app para ver todos los proyectos interactivos.</em></p>
</div>

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
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0%3A105c11%2C50%3A39c926%2C100%3Addf3dd&height=120&section=footer" width="100%"/>
</div>
