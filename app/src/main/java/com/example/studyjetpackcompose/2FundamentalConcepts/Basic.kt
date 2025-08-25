package com.example.studyjetpackcompose.`2FundamentalConcepts`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


// 定义一个可组合函数 Greeting
// 在 Jetpack Compose 中，所有 UI 元素都是通过 @Composable 标记的函数构建的
@Composable
fun Greeting() {
    // 使用 Text 组件在界面上显示一段文字
    // 参数 text 用来指定显示的内容
    Text(text = "Hello Jetpack Compose")
}


@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting()
}