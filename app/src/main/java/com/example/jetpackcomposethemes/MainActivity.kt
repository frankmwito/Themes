package com.example.jetpackcomposethemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposethemes.ui.theme.JetpackComposeThemesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeThemesTheme {
                themes()
                }
            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun themes()  {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
               Text ("Jetpack Compose Themes",
                   style = MaterialTheme.typography.bodyLarge,
                   color = MaterialTheme.colorScheme.onPrimary)
                },
                actions = {

                }
            )
        }, content = {paddingValues ->
            Column(
                modifier = Modifier.padding(paddingValues = paddingValues)
                    .fillMaxSize()
            ) {

            }
        }
    )
}

