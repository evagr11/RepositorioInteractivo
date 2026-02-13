package com.evagr.proyectitosinteractivos.data

import com.evagr.proyectitosinteractivos.proyectos.proyecto1.Propinas
import com.evagr.proyectitosinteractivos.proyectos.proyecto2.Botones
import com.evagr.proyectitosinteractivos.R

class MisProyectos {
    val proyectos = listOf(
        Proyecto(
            nombre = "Proyecto 1",
            descripcion = "Descripción del proyecto 1",
            imagen = R.drawable.lemon_restart,
            destino = Propinas::class.java
        ),
        Proyecto(
            nombre = "Proyecto 2",
            descripcion = "Descripción del proyecto 2",
            imagen = R.drawable.lemon_restart,
            destino = Botones::class.java
        )
    )

}