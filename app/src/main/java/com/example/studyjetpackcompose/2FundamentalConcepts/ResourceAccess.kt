package com.example.studyjetpackcompose.`2FundamentalConcepts`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.studyjetpackcompose.R

// 一个可组合函数，用来演示如何访问字符串资源
@Composable
fun AccessStringResource() {
    // Box 是一个容器布局，可以用来包裹和对齐子组件
    Box(
        modifier = Modifier.fillMaxSize(), // 让 Box 填充整个父布局大小
        contentAlignment = Alignment.Center // 将子组件放在 Box 的中央
    ){
        // Text 组件，用于显示文字
        // stringResource() 用来读取 strings.xml 中的字符串资源
        // colorResource() 用来读取 colors.xml 中的颜色资源
        Text(
            text = stringResource(R.string.hello), // 显示字符串资源 hello
            color = colorResource(R.color.green)   // 设置文字颜色为绿色资源
        )
    }
}

// 一个可组合函数，用来演示如何访问图片资源
@Composable
fun AccessImage(){
    // 使用 Box 来居中显示图片
    Box(
        modifier = Modifier.fillMaxSize(), // 填满父布局
        contentAlignment = Alignment.Center // 内容居中
    ){
        // Image 组件，用来显示图片
        // painterResource() 用来读取 drawable 文件夹下的图片资源
        Image(
            painter = painterResource(R.drawable.trees), // 加载 trees 图片资源
            contentDescription = "trees"                 // 图片的无障碍描述（如屏幕阅读器）
        )
    }
}
