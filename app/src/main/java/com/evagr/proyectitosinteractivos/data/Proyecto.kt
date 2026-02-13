package com.evagr.proyectitosinteractivos.data

import androidx.activity.ComponentActivity

data class Proyecto(
    val nombre: String,
    val descripcion: String,
    val imagen: Int,
    val destino: Class<out ComponentActivity>
)