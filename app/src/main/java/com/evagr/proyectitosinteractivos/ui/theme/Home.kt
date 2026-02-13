package com.evagr.proyectitosinteractivos.ui.theme

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evagr.proyectitosinteractivos.R
import com.evagr.proyectitosinteractivos.data.MisProyectos

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                Surface(
                    modifier = Modifier.Companion.fillMaxSize(),
                    color = colorResource(R.color.white)
                ) {
                    HomeApp()
                }
            }
        }
    }

    @Composable
    fun HomeApp() {

        val context = LocalContext.current
        val proyectos = MisProyectos().proyectos

        Column(
            modifier = Modifier.Companion
                .fillMaxSize()
                .background(colorResource(R.color.white)),
            horizontalAlignment = Alignment.Companion.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.Companion.height(20.dp))

            Text(
                text = "Repositorio interactivo",
                fontSize = 24.sp,
                fontWeight = FontWeight.Companion.Bold,
                modifier = Modifier.Companion
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                color = Color.Companion.Black,
                textAlign = TextAlign.Companion.Center
            )

            Spacer(modifier = Modifier.Companion.height(20.dp))

            LazyRow(
                modifier = Modifier.Companion.fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(proyectos) { proyecto ->
                    Column(
                        modifier = Modifier.Companion.fillMaxWidth(),
                        horizontalAlignment = Alignment.Companion.CenterHorizontally
                    ) {
                        Card(
                            modifier = Modifier.Companion.size(330.dp, 600.dp)
                        ) {
                            Image(
                                painter = painterResource(id = proyecto.imagen),
                                contentDescription = proyecto.nombre,
                                modifier = Modifier.Companion.fillMaxSize()
                            )
                        }

                        Spacer(modifier = Modifier.Companion.height(10.dp))

                        Text(
                            proyecto.nombre,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Companion.Bold
                        )
                        Text(proyecto.descripcion, fontSize = 14.sp)

                        Spacer(modifier = Modifier.Companion.height(10.dp))

                        Button(
                            onClick = {
                                context.startActivity(Intent(context, proyecto.destino))
                            },
                            modifier = Modifier.Companion
                                .width(150.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Companion.DarkGray),
                            shape = RoundedCornerShape(25.dp)
                        ) {
                            Text(
                                text = "Acceder",
                                color = Color.Companion.White,
                                fontWeight = FontWeight.Companion.Bold
                            )
                        }
                    }
                }
            }
        }
    }




    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun HomePreview() {
        ProyectitosInteractivosTheme {
            HomeApp()
        }
    }



}