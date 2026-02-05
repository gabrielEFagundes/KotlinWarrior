package com.gundes.kotlinwarrior

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gundes.kotlinwarrior.ui.theme.KotlinWarriorTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinWarriorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding(),
                    color = Color.Black
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        Surface(
            color = Color.White,
            modifier = Modifier
                .width(320.dp)
                .height(320.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = "Kotlin Warrior",
                    modifier = Modifier.padding(top = 24.dp),
                    fontSize = 32.sp,
                    fontWeight = FontWeight(800)
                )
                Text(
                    text = "The Supreme Wizard",
                    modifier = Modifier.padding(bottom = 32.dp)
                )
                Row(modifier = Modifier.fillMaxWidth().padding(24.dp), horizontalArrangement = Arrangement.SpaceBetween){
                    Text(
                        text = "LVL GOD",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(800)
                    )
                    Text(
                        text = "HP ∞",
                        color = Color.Red,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(800)
                    )
                }
                Text(
                    text = "A formidable oponent, with his Daemonshark, he's able to summon the power of Java and CSS.",
                    modifier = Modifier.padding(10.dp, 16.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    KotlinWarriorTheme {
//        Greeting("Android")
//    }
//}