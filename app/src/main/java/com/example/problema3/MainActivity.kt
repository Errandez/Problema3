package com.example.problema3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.problema3.ui.theme.Problema3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Problema3Theme {
                // A surface container using the 'background' color from the theme
                Surface (
                    color = MaterialTheme.colors.background
                        ){
                    Problema3()
                }
            }
        }
    }
}


@Composable
fun Problema3() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            modifier = Modifier.weight(1f)
        ){
            inicializador(título = "Text composable", Texto = "Displays text and follows Material Design guidelines.", Fondo = androidx.compose.ui.graphics.Color.Green, modifier = Modifier.weight(1f))
            inicializador(título = "Image composable", Texto = "Creates a composable that lays out and draws a given Painter class object.", Fondo = androidx.compose.ui.graphics.Color.Yellow, modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.weight(1f)
        ){
            inicializador(título = "Row composable", Texto = "A layout composable that places its children in a horizontal sequence.", Fondo = androidx.compose.ui.graphics.Color.Cyan, modifier = Modifier.weight(1f))
            inicializador(título = "Column composable", Texto = "A layout composable that places its children in a vertical sequence.", Fondo = androidx.compose.ui.graphics.Color.LightGray, modifier = Modifier.weight(1f))
        }
    }
}
@Composable
fun inicializador(título: String, Texto: String, Fondo: Color, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .background(Fondo)
            .fillMaxSize()
            .padding(16.dp)
            ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = título,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = Texto,
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Problema3Preview() {
    Problema3Theme {
        Problema3()
    }
}