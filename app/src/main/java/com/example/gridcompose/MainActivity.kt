package com.example.gridcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.ui.layout.ContentScale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        supportActionBar?.title = "Playas"

        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val list = listOf(
        "Playa 1",
        "Playa 2",
        "Playa 3",
        "Playa 4",
        "Playa 5",
        "Playa 6",
        "Playa 7",
        "Playa 8"
    )

    // List of drawable resource IDs for images
    val imageList = listOf(
        R.drawable.playa1,
        R.drawable.playa2,
        R.drawable.playa3,
        R.drawable.playa4,
        R.drawable.playa5,
        R.drawable.playa6,
        R.drawable.playa7,
        R.drawable.playa8
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 106.dp)
    ) {
        items(list.size) { index ->
            Box(
                modifier = Modifier
                    .size(250.dp)
            ) {

                val image = imageList[index]
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                Text(
                    text = list[index],
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(8.dp)
                        .background(Color.Yellow.copy(alpha = 0.3f))
                )
            }
        }
    }
}