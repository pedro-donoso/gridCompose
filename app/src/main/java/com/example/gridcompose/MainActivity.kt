package com.example.gridcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {

    val list =
        listOf(
            "Text 1",
            "Text 2",
            "Text 3",
            "Text 4",
            "Text 5",
            "Text 6",
            "Text 7",
            "Text 8",
            "Text 9",
            "Text 10",
            "Text 11",
            "Text 12",
            "Text 13",
            "Text 14",
            "Text 15",
            "Text 16",
            "Text 17",
            "Text 18",
            "Text 19",
            "Text 20"
        )

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 106.dp)
    ) {

        list.forEachIndexed { index, element ->
            val span = if (index % 4 == 0) {
                GridItemSpan(3)
            } else {
                GridItemSpan(1)
            }
            item(span = { span }) {
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .size(100.dp)
                ) {
                    Text(
                        text = element,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

        }
    }
}