package com.example.studyjetpackcompose.`4LayoutComposables`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ColumnSample() {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "文本1")
            Text(text = "文本2")
            Text(text = "文本3")
        }

}

@Preview(showSystemUi = true)
@Composable
fun ColumnPreview() {
    ColumnSample()
}