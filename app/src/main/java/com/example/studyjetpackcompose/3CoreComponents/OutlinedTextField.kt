package com.example.studyjetpackcompose.`3CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

// 一个可组合函数，用来演示自定义渐变文字输入框
@Composable
fun OutlinedTextField() {
    // 定义输入框的文本状态（可变字符串）
    var text by remember {
        mutableStateOf("")
    }

    // 定义彩虹颜色列表
    val rainBowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta
    )

    // 定义线性渐变画笔（Brush），让文字具有彩虹渐变效果
    val brush = remember {
        Brush.linearGradient(
            colors = rainBowColors
        )
    }

    // 使用 Box 居中放置 TextField
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        // TextField 输入框
        TextField(
            value = text, // 当前输入内容
            onValueChange = { text = it }, // 输入内容发生变化时更新状态
            textStyle =  TextStyle(
                brush = brush // 文字颜色设置为彩虹渐变效果
            )
        )

        // 可选：如果想使用 Material 的 OutlinedTextField，可以用下面这段
//        OutlinedTextField(
//            value = text,
//            onValueChange = { text = it },
//            label = {
//                Text("Label") // 输入框提示文字
//            }
//        )
    }
}

// 输入密码的可组合函数
@Composable
fun PasswordField() {
    // 定义密码输入状态，并使用 rememberSaveable 保持状态（可在配置更改后保存）
    var password by rememberSaveable {
        mutableStateOf("")
    }

    // 使用 Box 居中放置 TextField
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        // 密码输入框
        TextField(
            value = password, // 当前输入内容
            onValueChange = { password = it }, // 更新输入状态
            label = {
                Text("请输入密码:") // 输入框提示文字
            },
            visualTransformation = PasswordVisualTransformation(), // 输入时显示为 "●●●"（隐藏实际字符）
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password // 键盘类型设置为密码输入
            )
        )
    }
}




@Preview(showSystemUi = true)
@Composable
fun OutlinedTextFieldPreview() {
//    OutlinedTextField()
    PasswordField()
}