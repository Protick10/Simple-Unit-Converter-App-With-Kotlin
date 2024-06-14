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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pro.inc.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.roundToInt

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

    var inputValue by remember { mutableStateOf("") }
    var inputUnit by remember { mutableStateOf("Meter") }
    var outputUnit by remember { mutableStateOf("Meter") }
    var result by remember { mutableStateOf("") }
    var iExpanded by remember { mutableStateOf(false) }
    var oExpanded by remember { mutableStateOf(false) }
    val cnversionFactoro = remember { mutableStateOf(1.00) }
    val oconversionFactoro = remember { mutableStateOf(1.00) }

    fun convertUnit(){
        val inputValueDouble = inputValue.toDoubleOrNull() ?: 0.0
        val opututresult = (inputValueDouble * cnversionFactoro.value * 100 / oconversionFactoro.value).roundToInt() / 100.0
        result = opututresult.toString()
    }
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
        OutlinedTextField(value = inputValue, onValueChange = {
            inputValue = it
            convertUnit()
            //here goes what to do when the value of the text field changes
        // Spacer(modifier = Modifier.height(16.dp))

        },
            label = { Text("Enter Value") })
        Spacer(modifier = Modifier.height(16.dp))

        Row {
          //  val context = LocalContext.current

//            Button(onClick = {Toast.makeText(context, "Convert", Toast.LENGTH_LONG).show()}) {
//                Text("Convert")
//            }

            // Row is a composable that places its children horizontally. It is a layout composable that places its children in a horizontal sequence.
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))
//            Greeting(name ="Android", modifier = Modifier.padding(10.dp))

            //input box that means button and dropdown menu to select the input unit
            Box{
                Button(onClick = { iExpanded = true }) {
                    Text(inputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "drop down")
                    
                }
                DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false }) {
                    DropdownMenuItem(text = { Text("Centimeter") },
                        onClick = {
                            inputUnit = "Centimeter"
                            iExpanded = false //close the dropdown menu
                            cnversionFactoro.value = 0.01
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Meter") },
                        onClick = {
                            iExpanded = false //close the dropdown menu
                            inputUnit = "Meter"
                            cnversionFactoro.value = 1.0
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Inchis") },
                        onClick = {
                            iExpanded = false //close the dropdown menu
                            inputUnit = "Inchis"
                            cnversionFactoro.value = 0.0254
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Millimeter") },
                        onClick = {
                            iExpanded = false //close the dropdown menu
                            inputUnit = "Millimeter"
                            cnversionFactoro.value = 0.001
                            convertUnit()
                        })

                }


            }

            Spacer(modifier = Modifier.width(16.dp))

            //output box that means button and dropdown menu to select the output unit

            Box{
                Button(onClick = {oExpanded = true}) {
                    Text(outputUnit)
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "drop down")

                }

                DropdownMenu(expanded = oExpanded, onDismissRequest = {oExpanded = false}) {
                    DropdownMenuItem(text = { Text("Centimeter") },
                        onClick = {
                            oExpanded = false
                            outputUnit = "Centimeter"
                            oconversionFactoro.value = 0.01
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Meter") },
                        onClick = {
                            oExpanded = false
                            outputUnit = "Meter"
                            oconversionFactoro.value = 1.0
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Inchis") },
                        onClick = {
                            oExpanded = false
                            outputUnit = "Inchis"
                            oconversionFactoro.value = 0.0254
                            convertUnit()
                        })
                    DropdownMenuItem(text = { Text("Millimeter") },
                        onClick = {
                            oExpanded = false
                            outputUnit = "Millimeter"
                            oconversionFactoro.value = 0.001
                            convertUnit()
                        })

                }


            }


        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "result : $result $outputUnit")
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