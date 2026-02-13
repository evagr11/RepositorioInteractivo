package com.evagr.proyectitosinteractivos.proyectos.proyecto5

class MisPreguntas {
    companion object{
        //Como Pregunta es de tipo generico tengo q poner <*> para indicar que puede ser de cualquier tipo, q se definira mas tarde
        fun cargarPreguntas() : ArrayList<Pregunta<*>>{
            val listaAuxiliar : ArrayList<Pregunta<*>> = ArrayList<Pregunta<*>>()

            listaAuxiliar.add(Pregunta("¿Kotlin es orientado a objetos? (true/false)", true))
            listaAuxiliar.add(Pregunta("¿Cuánto es 5 + 3?", 8))
            listaAuxiliar.add(Pregunta("Palabra clave para variable inmutable", "val"))
            listaAuxiliar.add(Pregunta("¿Cuánto es 10.5 + 2.5?", 13.0))
            listaAuxiliar.add(Pregunta("¿Qué palabra define una función?", "fun"))
            listaAuxiliar.add(Pregunta("¿Kotlin sirve para Android? (true/false)", true))
            listaAuxiliar.add(Pregunta("Tipo de dato para decimales", "double"))
            listaAuxiliar.add(Pregunta("Operador de igualdad", "=="))
            listaAuxiliar.add(Pregunta("Resultado de 4 * 2", 8))
            listaAuxiliar.add(Pregunta("¿Kotlin soporta programación funcional? (true/false)", true))

            return listaAuxiliar
        }
    }
}