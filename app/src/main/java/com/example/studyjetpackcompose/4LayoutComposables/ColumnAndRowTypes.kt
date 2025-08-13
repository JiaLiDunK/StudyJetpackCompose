package com.example.studyjetpackcompose.`4LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LazyColumnSample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text("懒加载列1Column")
        LazyColumn (
            modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .background(Color.Blue),
        ){
            items(100) { index ->

                Text(
                    text = "第${index}个懒加载列",
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                        .background(Color.Gray),
                )
            }
        }
    }
}
@Composable
fun LazyRowSample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text("懒加载列1Row")
        LazyRow(
            modifier = Modifier.fillMaxWidth()
                .height(200.dp)
                .background(Color.Blue),
        ){
            items(100) { index ->

                Text(
                    text = "第${index}个懒加载列",
                    modifier = Modifier.fillMaxSize().padding(16.dp)
                        .background(Color.Gray),
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnSampleExample() {
//    LazyColumnSample()
    LazyRowSample()
}