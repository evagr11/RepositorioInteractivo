package com.evagr.proyectitosinteractivos.proyectos.proyecto4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.evagr.proyectitosinteractivos.ui.theme.ProyectitosInteractivosTheme

/**
 * Mini-proyecto 4: galería de tarjetas con imagen y nombre.
 */
class Galeria : ComponentActivity() {
    /**
     * Carga [GaleriaApp] dentro del tema.
     *
     * @param savedInstanceState estado guardado de la Activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectitosInteractivosTheme {
                Surface(

                ){
                    GaleriaApp()
                }

            }
        }
    }

    /**
     * Carga las miniaturas y se las pasa a [ListaMiniaturas].
     */
    @Composable
    fun GaleriaApp() {

        ListaMiniaturas(MisMiniaturas.cargarMiniaturas())
    }

    /**
     * `LazyColumn` con una [MiniaturaCard] por miniatura.
     *
     * @param listaMinis miniaturas que se muestran.
     * @param modifier modificador de la lista.
     */
    @Composable
    fun ListaMiniaturas(listaMinis : ArrayList<Miniaturas>, modifier: Modifier = Modifier){
        LazyColumn(
            modifier = Modifier
        ) {
            items(listaMinis){ miniaturas ->
                MiniaturaCard(
                    miniaturas,
                    modifier = Modifier.padding(8.dp)
                )

            }
        }
    }

    /**
     * Tarjeta con la imagen recortada a todo el ancho y el nombre debajo.
     *
     * @param mini miniatura que se pinta.
     * @param modifier modificador de la tarjeta.
     */
    @Composable
    fun MiniaturaCard(mini : Miniaturas, modifier: Modifier = Modifier){
        Card(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(mini.imagenMiniatura),
                    contentDescription = stringResource(mini.nombreMiniatura),
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = LocalContext.current.getString(mini.nombreMiniatura),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }


    }

    @Preview(showSystemUi = true, showBackground = true)
    @Composable
    fun GaleriaAppPreview(){
        ProyectitosInteractivosTheme() {
            GaleriaApp()
        }
    }

}