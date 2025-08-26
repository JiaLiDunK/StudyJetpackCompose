package com.example.studyjetpackcompose.`10FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun FloatingButtonSample() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,

    ){
        ExtendedFloatingActionButton(
            onClick = {
            },
            content = {
                Text(text= "这个是按钮")
            }
        )
    }

}


@Preview(showSystemUi = true)
@Composable
fun FloatingButtonSamplePreview() {
    FloatingButtonSample()
}

