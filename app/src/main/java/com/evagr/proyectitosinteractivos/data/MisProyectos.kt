package com.evagr.proyectitosinteractivos.data

import com.evagr.proyectitosinteractivos.R
import com.evagr.proyectitosinteractivos.proyectos.proyecto1.Propinas
import com.evagr.proyectitosinteractivos.proyectos.proyecto2.Botones
import com.evagr.proyectitosinteractivos.proyectos.proyecto3.Login
import com.evagr.proyectitosinteractivos.proyectos.proyecto4.Galeria
import com.evagr.proyectitosinteractivos.proyectos.proyecto5.Formulario
import com.evagr.proyectitosinteractivos.proyectos.proyecto6.MainActivity


class MisProyectos {
    val proyectos = listOf(
        Proyecto(
            "Propinas",
            "Calculadora de propinas",
            R.drawable.propinas,
            Propinas::class.java
        ),
        Proyecto(
            "Botones",
            "Interacción con botones",
            R.drawable.btn_dinamicos,
            Botones::class.java
        ),
        Proyecto(
            "Login",
            "Formulario de inicio de sesión",
            R.drawable.login,
            Login::class.java
        ),
        Proyecto(
            "Galería",
            "Miniaturas de imágenes",
            R.drawable.galeria,
            Galeria::class.java
        ),
        Proyecto(
            "Formulario",
            "Test de preguntas",
            R.drawable.formulario,
            Formulario::class.java
        ),
        Proyecto(
            "Login avanzado",
            "Login con ViewModel",
            R.drawable.login_avanzado,
            MainActivity::class.java
        )
    )
}
