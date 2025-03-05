package com.example.mywishlistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.ui.Modifier
import com.example.mywishlistapp.ui.theme.MyWishListAppTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyWishListAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().padding(WindowInsets.systemBars.asPaddingValues()),
                    color = MaterialTheme.colorScheme.background
                ){
                    Navigation()
                }
            }
        }
    }
}