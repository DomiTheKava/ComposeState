package com.example.composablestatescodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.example.composablestatescodelab.ui.theme.ComposableStatesCodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableStatesCodeLabTheme {
                Column {
                    WellnessScreen()
                }
            }
        }
    }
}


