package com.example.jetpackcomposethemes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                modifier = Modifier.fillMaxWidth().padding(8.dp)
                    .background(MaterialTheme.colorScheme.onBackground),
                title = {
               Text ("Jetpack Compose Themes",
                   style = MaterialTheme.typography.bodyLarge,
                   textAlign = TextAlign.Center,
                   color = MaterialTheme.colorScheme.onBackground)
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

