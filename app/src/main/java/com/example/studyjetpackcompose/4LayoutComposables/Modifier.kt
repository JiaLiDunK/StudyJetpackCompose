package com.example.studyjetpackcompose.`4LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ModifierSample() {
    Box(
        modifier = Modifier.size(200.dp).background(
            color = Color.Gray
        ),
        contentAlignment = Alignment.Center
    ){
        Text("这个就是Modifier",
            modifier = Modifier
//                .size(50.dp)
                .background(Color.Red)
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun ModifierPreview() {
    ModifierSample()
}


