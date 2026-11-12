package com.evagr.proyectitosinteractivos.proyectos.proyecto5

/**
 * Pregunta del test con una respuesta de cualquier tipo.
 *
 * @param T tipo de la respuesta: `Boolean`, `Int`, `Double` o `String`.
 * @property pregunta enunciado.
 * @property respuesta respuesta correcta.
 */
data class Pregunta <T>(
    val pregunta : String,
    val respuesta : T
) {
}