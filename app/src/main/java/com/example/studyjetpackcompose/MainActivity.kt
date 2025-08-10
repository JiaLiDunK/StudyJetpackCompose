package com.example.studyjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.studyjetpackcompose.`2FundamentalConcepts`.AccessImage
import com.example.studyjetpackcompose.`2FundamentalConcepts`.AccessStringResource
import com.example.studyjetpackcompose.`2FundamentalConcepts`.Greeting
import com.example.studyjetpackcompose.`3CoreComponents`.AnnotatedStringWithListSample
import com.example.studyjetpackcompose.`3CoreComponents`.ButtonFileSample
import com.example.studyjetpackcompose.`3CoreComponents`.PartiallySelectedTextField
import com.example.studyjetpackcompose.ui.theme.StudyJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyJetpackComposeTheme {
//                Greeting()
//                AccessStringResource()
//                AccessImage();
//                AnnotatedStringWithListSample();
                ButtonFileSample();
            }
        }
    }
}

