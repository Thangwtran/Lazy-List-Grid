package com.example.listgridcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listgridcompose.ui.theme.ListGridComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListGridComposeTheme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {

    var currentScreen by remember {
        mutableStateOf(Screen.VideoDetailScreen)
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        if (currentScreen == Screen.VideoDetailScreen) {
            VideoDetailScreen() {
                currentScreen = Screen.CategoryScreen
            }
        } else {
            CategoryScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListGridComposeTheme {
        MainApp()
    }
}

enum class Screen {
    VideoDetailScreen,
    CategoryScreen
}