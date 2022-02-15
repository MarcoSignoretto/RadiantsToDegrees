package com.msignoretto.radiantstodegrees

import android.os.Bundle
import android.widget.EditText
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.msignoretto.radiantstodegrees.ui.theme.RadiantsToDegreesTheme
import com.msignoretto.radiantstodegrees.utils.Utils

class MainActivity : ComponentActivity() {

    private val degrees = mutableStateOf(0.0)
    private val radiantsString = mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadiantsToDegreesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(24.dp)) {
                        TextField(value = radiantsString.value, onValueChange = {radiantsString.value = it} )
                        Spacer(modifier= Modifier.height(24.dp))
                        Button(onClick = { degrees.value = Utils.toDegree(radiantsString.value.toDouble()) }) {
                            Text(text = "Convert to Degrees")
                        }
                        Spacer(modifier= Modifier.height(24.dp))
                        Text(text = "Degrees: ${degrees.value}")
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RadiantsToDegreesTheme {
        Greeting("Android")
    }
}