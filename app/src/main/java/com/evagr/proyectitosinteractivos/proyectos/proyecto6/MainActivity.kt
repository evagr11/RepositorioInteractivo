package com.evagr.proyectitosinteractivos.proyectos.proyecto6

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evagr.proyectitosinteractivos.R
import com.evagr.proyectitosinteractivos.proyectos.proyecto6.MainViewModel
import com.evagr.proyectitosinteractivos.ui.theme.ProyectitosInteractivosTheme

class MainActivity : ComponentActivity() {
    val viewModelTest = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                LoginApp(viewModelTest)
            }
        }
    }
}

/*
@Composable
fun FormularioApp1(
    viewModel: MainViewModel = MainViewModel()
){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        Text(
            text = "Hola, ${viewModel.nombre}",
            style = MaterialTheme.typography.headlineMedium
        )
        TextField(
            value= viewModel.nombre,
            onValueChange = {
                viewModel.cambiarNombre(it)
            },
            label={
                Text(
                    text = "Introduce tu respuesta"
                )
            }
        )
        Text(
            text = "Contador: ${viewModel.contador}",
            style = MaterialTheme.typography.bodyMedium
        )

        Button(
            onClick = {
                viewModel.incrementarContador()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text ="Aumentar"
            )
        }
        Button(
            onClick = {
                viewModel.disminuirContador()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text ="Disminuir"
            )
        }
    }
}
 */

/*
@Composable
fun FormularioApp2(
    viewModel: MainViewModel = MainViewModel()
){
    val uiState by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        Text(
            text = "Hola, ${uiState.nombre}",
            style = MaterialTheme.typography.headlineMedium
        )
        TextField(
            value= uiState.nombre,
            onValueChange = {
                viewModel.cambiarNombre(it)
            },
            label={
                Text(
                    text = "Introduce tu respuesta"
                )
            }
        )
        Text(
            text = "Contador: ${uiState.contador}",
            style = MaterialTheme.typography.bodyMedium
        )

        Button(
            onClick = {
                viewModel.incrementarContador()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text ="Aumentar"
            )
        }
        Button(
            onClick = {
                viewModel.disminuirContador()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text ="Disminuir"
            )
        }
    }
}

 */

@Composable
fun LoginApp(
    viewModel: MainViewModel = MainViewModel()
){
    val uiState by viewModel.uiState.collectAsState()

    val imagenPerfil = painterResource(R.drawable.sin_usuario)

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 40.dp)
            .safeDrawingPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = imagenPerfil,
            contentDescription = "Foto de perfil",
            modifier = Modifier.height(80.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        TextField(
            value= uiState.nombre,
            onValueChange = {
                viewModel.cambiarNombre(it)
            },
            label={
                Text(
                    text = "Introduce tu nombre"
                )
            },
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth()
        )

        TextField(
            value= uiState.contraseña,
            onValueChange = {
                viewModel.cambiarContraseña(it)
            },
            label={
                Text(
                    text = "Introduce tu contraseña"
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth()
        )

        Button(
            onClick = {
                if(!uiState.nombre.isEmpty() && !uiState.contraseña.isEmpty()){
                    Toast.makeText(context, "Login correcto, \"Hola, ${uiState.nombre}\"", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(context, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
                }
            },
            modifier = Modifier.padding(top = 10.dp)
        ){
            Text(text = "Entrar")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProyectitosInteractivosTheme {
        LoginApp()
    }
}