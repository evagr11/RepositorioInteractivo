package com.evagr.proyectitosinteractivos.proyectos.proyecto2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evagr.proyectitosinteractivos.R
import com.evagr.proyectitosinteractivos.ui.theme.ProyectitosInteractivosTheme

class Botones : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(modifier: Modifier = Modifier){
    val lemonTree = painterResource(R.drawable.lemon_tree)
    val lemonSequeeze = painterResource(R.drawable.lemon_squeeze)
    val lemonDrink = painterResource(R.drawable.lemon_drink)
    val lemonRestart = painterResource(R.drawable.lemon_restart)

    var case by remember() { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .safeDrawingPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        if(case == 0){
            Text(
                text = "Pulsa siguiente para coger un limon",
                modifier = modifier
            )
            Image(
                painter = lemonTree,
                contentDescription = "Arbol"
            )
            Button(
                onClick = {
                    case += 1
                },
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(
                    text = "Siguiente"
                )
            }
        } else if(case == 1){
            Text(
                text = "Pulsa siguiente para hacer una limonada",
                modifier = modifier
            )
            Image(
                painter = lemonSequeeze,
                contentDescription = "Arbol"
            )
            Button(
                onClick = {
                    case += 1
                },
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(
                    text = "Siguiente"
                )
            }
        } else if(case == 2){
            Text(
                text = "Pulsa siguiente para beberte la limonada",
                modifier = modifier
            )
            Image(
                painter = lemonDrink,
                contentDescription = "Arbol"
            )
            Button(
                onClick = {
                    case += 1
                },
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(
                    text = "Siguiente"
                )
            }
        } else if(case == 3){
            Text(
                text = "Pulsa siguiente para volver al arbol",
                modifier = modifier
            )
            Image(
                painter = lemonRestart,
                contentDescription = "Arbol"
            )
            Button(
                onClick = {
                    case = 0
                },
                modifier = Modifier.padding(top = 10.dp)
            ) {
                Text(
                    text = "Siguiente"
                )
            }
        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProyectitosInteractivosTheme {
        Greeting()
    }
}