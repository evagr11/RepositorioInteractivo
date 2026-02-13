package com.evagr.proyectitosinteractivos.proyectos.proyecto3

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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evagr.proyectitosinteractivos.R
import com.evagr.proyectitosinteractivos.ui.theme.ProyectitosInteractivosTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                Surface() {
                    InputText(context = this)
                }
            }
        }
    }

    @Composable
    fun MyTextField(label : String, value: String, onValueChange : (String)-> Unit, modifier: Modifier = Modifier, visualTransformation: VisualTransformation = VisualTransformation.None){
        TextField(
            label = {
                Text(
                    text = label
                )
            },
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            modifier = modifier,
            visualTransformation = visualTransformation
        )

    }

    @Composable
    fun InputText(context: Context){
        var inputTextUsuario by remember { mutableStateOf("") }
        var inputTextContrasena by remember { mutableStateOf("") }

        val imagenPerfil = painterResource(R.drawable.sin_usuario)

        Column(
            modifier = Modifier
                .statusBarsPadding()
                .padding(horizontal = 40.dp)
                .safeDrawingPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = imagenPerfil,
                contentDescription = "Foto de perfil",
            )

            Spacer(modifier = Modifier.height(20.dp))

            MyTextField(
                label = "Nombre de usuario",
                value = inputTextUsuario,
                onValueChange = {inputTextUsuario = it},
                modifier = Modifier.padding(bottom = 32.dp)
                    .fillMaxWidth()
            )

            MyTextField(
                label = "Contraseña",
                value = inputTextContrasena,
                onValueChange = {inputTextContrasena = it},
                visualTransformation = PasswordVisualTransformation(), //Ocultar contraseña
                modifier = Modifier.padding(bottom = 32.dp)
                    .fillMaxWidth()
            )

            Button(
                onClick = {
                    if(!inputTextUsuario.isEmpty() && !inputTextContrasena.isEmpty()){
                        Toast.makeText(context, "Login correcto", Toast.LENGTH_SHORT).show()
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
    fun LoginPreview() {
        ProyectitosInteractivosTheme {
            InputText(context = this)
        }
    }
}