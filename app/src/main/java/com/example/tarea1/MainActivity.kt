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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn

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
                    Column {
                        Imagenes(painterResource(R.drawable._111),"Gato 1")
                        Imagenes(painterResource(R.drawable._2222),"Gato 2")
                        Imagenes(painterResource(R.drawable._333),"Gato 3")

                        textos(
                            modifier = Modifier.padding(innerPadding),
                            Bienvenida = getString(R.string.Bienvenida),
                            Explorando = getString(R.string.Explorando),
                            Nombre = getString(R.string.Nombre,"Juan")
                        )
                    }
                }
            }
        }
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
fun Imagenes(imagen: androidx.compose.ui.graphics.painter.Painter, Nombre: String)
{
    Image(painter = imagen, contentDescription = Nombre )
    Log.d("Iniciando imagen: ", "Mostrando Imagen $Nombre")
}

@OptIn(UnstableApi::class)
@Composable
fun textos(Bienvenida: String, Explorando: String, Nombre: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = Bienvenida)
        Text(text = Explorando)
        Text(text = "Nombre: $Nombre")

    }

    // Log de los textos que se están mostrando
    Log.i("Prueba Bienvenida", "Mensaje 1 : $Bienvenida")
    Log.i("Prueba explorando", "Mensaje 2: $Explorando")
    Log.i("Prueba Nombre", "Mensaje 3 : $Nombre")
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarea1Theme {
        Greeting("Android")
    }
}
