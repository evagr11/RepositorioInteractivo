package com.evagr.proyectitosinteractivos.proyectos.proyecto4

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Una tarjeta de la galería.
 *
 * @property nombreMiniatura id del texto con el nombre.
 * @property imagenMiniatura id del drawable con la imagen.
 */
data class Miniaturas(@StringRes val nombreMiniatura : Int, @DrawableRes val imagenMiniatura : Int)