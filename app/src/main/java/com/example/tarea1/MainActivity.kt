package com.example.tarea1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.OptIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.tooling.preview.Preview
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi
import com.example.tarea1.ui.theme.Tarea1Theme
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    @OptIn(UnstableApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Imagenes()

                }
            }
        }
        val Bienvenida = getString(R.string.Bienvenida)
        val Explorando = getString(R.string.Explorando)
        val Nombre = getString(R.string.Nombre,"Juan")

        Log.i("Prueba Bienvenida", "Mensaje 1 : $Bienvenida")
        Log.i("Prueba explorando", "Mensaje 2: $Explorando")
        Log.i("Prueba Nombre", "Mensaje 3 : $Nombre")



    }
}


@OptIn(UnstableApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    Log.i("Iniciando", "Iniciado Correctamente")
}

@OptIn(UnstableApi::class)
@Composable
fun Imagenes()
{
    Image(painter = painterResource(id = R.drawable.whatsapp_image_2025_03_22_at_19_09_39), contentDescription = "Imagen 1")
    Log.i("Iniciando", "Iniciado Correctamente")

    Image(painter = painterResource(id = R.drawable.whatsapp_image_2025_03_22_at_19_09_59), contentDescription = "Imagen 2")
    Log.i("Iniciando", "Iniciado Correctamente")

    Image(painter = painterResource(id = R.drawable.whatsapp_image_2025_03_22_at_19_14_28), contentDescription = "Imagen 3")
    Log.i("Iniciando", "Iniciado Correctamente")


}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea1Theme {
        Greeting("Android")
    }
}