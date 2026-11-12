package com.evagr.proyectitosinteractivos.data

import androidx.activity.ComponentActivity

/**
 * Una tarjeta del menú principal.
 *
 * @property nombre título de la tarjeta.
 * @property descripcion texto corto que sale debajo del título.
 * @property imagen id del drawable con la captura del mini-proyecto.
 * @property destino Activity que se abre al pulsar «Acceder».
 */
data class Proyecto(
    val nombre: String,
    val descripcion: String,
    val imagen: Int,
    val destino: Class<out ComponentActivity>
)