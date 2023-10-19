package com.gowittgroup.smartassist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartAssistTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val scope = rememberCoroutineScope()
                    var text by remember {
                        mutableStateOf("Loading")
                    }
                    LaunchedEffect(key1 = true){
                        scope.launch {
                            text = Greeting().greeting()
                        }
                    }
                    
                    GreetingView(text = text)
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    SmartAssistTheme {
        GreetingView("Hello, Android!")
    }
}
