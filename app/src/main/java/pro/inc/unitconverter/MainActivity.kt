package pro.inc.unitconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pro.inc.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {
//                Scaffold(modifier = Modifier.fillMaxSize(),
//
//
//                )
//                { innerPadding ->
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
//                    UnitCnverter()
//                }

                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    UnitCnverter()
                }
            }
        }
    }
}

@Composable
fun UnitCnverter() {
    Column {
        // Column is a composable that places its children vertically. It is a layout composable that places its children in a vertical sequence.
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))

        Text(text = "Unit Converter")
        OutlinedTextField(value = "", onValueChange = {
            //here goes what to do when the value of the text field changes
        })

        Row {

            // Row is a composable that places its children horizontally. It is a layout composable that places its children in a horizontal sequence.
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))

        }

        Text(text = "result")
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    UnitConverterTheme {
////        Greeting("Android")
//    }
//}


// create ur own preview

@Preview(showBackground = true)
@Composable
fun UnitCnverterPreview() {

        UnitCnverter()

}