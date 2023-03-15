package com.example.hilt_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hilt_compose.ui.theme.Hilt_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hilt_ComposeTheme {

            }
        }
    }
}

class Person(){
    val name= "Ryan"

}

