package com.allan.firstprojectsafarilab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.allan.firstprojectsafarilab.ui.theme.FirstProjectSafariLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstProjectSafariLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                   // Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {

   Column (horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Top,
       modifier = Modifier
           .fillMaxSize()
           .background(color = Color.White)) {

       Text(text = "Allan's First App",
           color = Color.Magenta,
           fontSize = 30.sp,
           fontFamily = FontFamily.Cursive,)
       Text(text = "Welcome to Android App",
           color = Color.Magenta,
           fontFamily = FontFamily.Monospace)
       
       
       Image(painter = painterResource(id = R.drawable.muhammadaliapp), contentDescription = "Null")
   }
}

@Preview
@Composable
private fun Homepreview() {
    Home()
}

