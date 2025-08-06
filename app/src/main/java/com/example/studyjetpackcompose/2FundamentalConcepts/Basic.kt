package com.example.studyjetpackcompose.`2FundamentalConcepts`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Greeting(){
    Text(text = "Hello Jetpack Compose")
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting()
}