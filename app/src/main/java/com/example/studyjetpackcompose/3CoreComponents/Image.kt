package com.example.studyjetpackcompose.`3CoreComponents`

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studyjetpackcompose.R

// 一个可组合函数，用于展示图片并添加特殊效果
@Composable
fun ImageSample() {
    // 定义一个彩虹渐变的画笔（Brush）
    // 使用 sweepGradient() 实现环形渐变效果
    val rainbow = remember {
        Brush.sweepGradient(
            colors = listOf(
                Color.Red,      // 红色
                Color.Yellow,   // 黄色
                Color.Green,    // 绿色
                Color.Blue,     // 蓝色
                Color.Magenta   // 洋红色
            )
        )
    }

    // 定义边框宽度
    val borderWidth = 10.dp

    // 显示图片
    Image(
        painter = painterResource(R.drawable.trees), // 加载 drawable 下的 trees 图片资源
        contentDescription = "trees",                // 图片的描述，用于无障碍支持
        contentScale = ContentScale.Crop,            // 图片裁剪方式：铺满并裁剪溢出部分
        modifier = Modifier
            .size(300.dp)                            // 设置图片显示区域大小为 300dp
//          .clip(CircleShape)                       // 可选：把图片裁剪成圆形（目前注释掉了）
            .border(
                BorderStroke(borderWidth, rainbow),  // 给图片添加环形渐变边框
            ),
        alignment = Alignment.Center,                // 图片居中对齐
        colorFilter = ColorFilter.colorMatrix(       // 应用颜色滤镜
            ColorMatrix().apply {
                setToSaturation(0f)                  // 设置饱和度为 0，即让图片变为黑白
            }
        )
    )
}


@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    ImageSample()
}
