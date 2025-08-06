package com.example.studyjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.studyjetpackcompose.`2FundamentalConcepts`.AccessStringResource
import com.example.studyjetpackcompose.`2FundamentalConcepts`.Greeting
import com.example.studyjetpackcompose.ui.theme.StudyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyJetpackComposeTheme {
                Greeting()
                AccessStringResource()
            }
        }
    }
}

