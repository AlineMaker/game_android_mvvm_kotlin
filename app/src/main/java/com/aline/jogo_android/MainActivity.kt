package com.aline.jogo_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aline.jogo_android.ui.theme.Jogo_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jogo_AndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                 StartScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun StartScreen(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0, 0, 0)),
    ) {
        Spacer(modifier= Modifier.height(25.dp))
        Row(modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically


    ) {
            Text(text = "Score: 0050 ",
             color = Color.White)

            Spacer(modifier = Modifier.width(200.dp))


            Text(text = "Lives: ",
                color = Color.White,
                )
            AndroidEnemy(color = Color.Green,
                modifier = Modifier.size(10.dp))
            AndroidEnemy(color = Color.Green,
                modifier = Modifier.size(10.dp))
            AndroidEnemy(color = Color.Green,
                modifier = Modifier.size(10.dp))

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
            horizontalArrangement = Arrangement.Absolute.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AndroidEnemy(color = Color.Green,
                modifier = Modifier.size(70.dp))
            AndroidEnemy(color = Color.Red,
                modifier = Modifier.size(70.dp))
            AndroidEnemy(color = Color.Blue,
                modifier = Modifier.size(70.dp))
            AndroidEnemy(color = Color.Yellow,
                modifier = Modifier.size(70.dp))
            AndroidEnemy(color = Color.Green,
                modifier = Modifier.size(70.dp))
        }

    }

    Column (
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ){
        Card(



        ) {
            Text(text = " Press Start",
                fontSize =( 32.sp)
            )
        }
    }


}






@Composable
fun AndroidEnemy(modifier: Modifier = Modifier,
                 color: Color
            ) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.baseline_android_24),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )

}