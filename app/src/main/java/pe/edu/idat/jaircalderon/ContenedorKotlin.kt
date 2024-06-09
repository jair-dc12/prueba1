package pe.edu.idat.jaircalderon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.idat.jaircalderon.ui.theme.JairCalderonTheme

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JairCalderonTheme {

    }
}

@Composable
fun MiColumnaPrueba(){

    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Texto 1", modifier = Modifier.fillMaxWidth())
    }
}















