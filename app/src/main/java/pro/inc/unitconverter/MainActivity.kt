package pro.inc.unitconverter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Column is a composable that places its children vertically. It is a layout composable that places its children in a vertical sequence.
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))

        Text(text = "Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        Spacer(modifier = Modifier.padding(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            //here goes what to do when the value of the text field changes
        // Spacer(modifier = Modifier.height(16.dp))
        })
        Spacer(modifier = Modifier.height(16.dp))

        Row {
          //  val context = LocalContext.current

//            Button(onClick = {Toast.makeText(context, "Convert", Toast.LENGTH_LONG).show()}) {
//                Text("Convert")
//            }

            // Row is a composable that places its children horizontally. It is a layout composable that places its children in a horizontal sequence.
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
            Box{
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "drop down")
                    
                }


            }

            Box{
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "drop down")

                }


            }
        }
        Spacer(modifier = Modifier.height(16.dp))

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