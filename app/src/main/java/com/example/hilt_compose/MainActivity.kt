package com.example.hilt_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hilt_compose.ui.theme.Hilt_ComposeTheme
import com.example.hilt_compose.ui.theme.MyViewmodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hilt_ComposeTheme {

                val mViewModel = hiltViewModel<MyViewmodel>()
            }
        }
    }
}

