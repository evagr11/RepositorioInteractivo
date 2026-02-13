package com.evagr.proyectitosinteractivos.proyectos.proyecto5

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evagr.proyectitosinteractivos.ui.theme.ProyectitosInteractivosTheme
import androidx.compose.runtime.setValue


class Formulario : ComponentActivity() {

    var respuestas = Array(10) {""}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                Surface(

                ){
                    FormularioApp()
                }
            }
        }


    }

    @Composable
    fun FormularioApp(){
        ListaPreguntas(MisPreguntas.cargarPreguntas())
    }

    @Composable
    fun ListaPreguntas(listaPreg : ArrayList<Pregunta<*>>, modifier: Modifier = Modifier){

        val contexto = LocalContext.current

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                item {PreguntaCard(listaPreg[0], 0)}
                item {PreguntaCard(listaPreg[1], 1)}
                item {PreguntaCard(listaPreg[2], 2)}
                item {PreguntaCard(listaPreg[3], 3)}
                item {PreguntaCard(listaPreg[4], 4)}
                item {PreguntaCard(listaPreg[5], 5)}
                item {PreguntaCard(listaPreg[6], 6)}
                item {PreguntaCard(listaPreg[7], 7)}
                item {PreguntaCard(listaPreg[8], 8)}
                item {PreguntaCard(listaPreg[9], 9)}

            }

            Button(
                onClick = {
                    Score.score = 0
                    validarRespuestas(listaPreg)
                    Toast.makeText(
                        contexto,
                        "Has acertado ${Score.score} preguntas",
                        Toast.LENGTH_LONG
                    ).show()

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Finalizar Test")
            }
        }

    }

    @Composable
    fun PreguntaCard(preg: Pregunta<*>, index : Int, modifier: Modifier = Modifier){
        var inputText by remember{ mutableStateOf((respuestas[index]))
        }
        Card(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = preg.pregunta,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
                TextField(
                    label = {
                        Text("Escribe tu respuesta")
                    },
                    value = inputText,
                    onValueChange = {
                        inputText = it
                        respuestas[index] = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }
    }

    fun validarRespuestas(listaPreg: ArrayList<Pregunta<*>>){
        for (i in 0 until listaPreg.size) {
            val user = respuestas[i]
            val correcta = listaPreg[i].respuesta
            // boolean
            if (i == 0 && user == correcta.toString()) { Score.score++ }
            // int
            if (i == 1 && user.toIntOrNull() == correcta) { Score.score++ }
            // txt
            if (i == 2 && user == correcta.toString()) { Score.score++ }
            // double
            if (i == 3 && user.toDoubleOrNull() == correcta) { Score.score++ }
            // txt
            if (i == 4 && user == correcta.toString()) { Score.score++ }
            // boolean
            if (i == 5 && user== correcta.toString()) { Score.score++ }
            // txt
            if (i == 6 && user == correcta.toString()) { Score.score++ }
            // txt
            if (i == 7 && user == correcta.toString()) { Score.score++ }
            // int
            if (i == 8 && user.toIntOrNull() == correcta) { Score.score++ }
            // boolean
            if (i == 9 && user == correcta.toString()) { Score.score++ }

        }

    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun FormularioPreview() {
        ProyectitosInteractivosTheme {
            FormularioApp()
        }
    }
}