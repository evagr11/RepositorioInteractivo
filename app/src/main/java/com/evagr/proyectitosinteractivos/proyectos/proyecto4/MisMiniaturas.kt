package com.evagr.proyectitosinteractivos.proyectos.proyecto4


import com.evagr.proyectitosinteractivos.R

class MisMiniaturas {
    companion object{
        fun cargarMiniaturas() : ArrayList<Miniaturas>{
            val listaAuxiliar : ArrayList<Miniaturas> = ArrayList<Miniaturas>()

            listaAuxiliar.add(Miniaturas(R.string.SuperPusheenicorn,R.drawable.bicho1))
            listaAuxiliar.add(Miniaturas(R.string.PusheenHeart,R.drawable.bicho2))
            listaAuxiliar.add(Miniaturas(R.string.Pusheenicorn,R.drawable.bicho3))
            listaAuxiliar.add(Miniaturas(R.string.PusheenMermaid,R.drawable.bicho4))
            listaAuxiliar.add(Miniaturas(R.string.PusheenChef,R.drawable.bicho5))
            listaAuxiliar.add(Miniaturas(R.string.PusheenWitch,R.drawable.bicho6))
            listaAuxiliar.add(Miniaturas(R.string.PusheenBallerina,R.drawable.bicho7))
            listaAuxiliar.add(Miniaturas(R.string.PusheenDinosaur,R.drawable.bicho8))

            return listaAuxiliar
        }
    }

}