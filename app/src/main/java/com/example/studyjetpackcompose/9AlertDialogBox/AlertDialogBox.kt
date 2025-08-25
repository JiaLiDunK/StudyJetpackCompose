package com.example.studyjetpackcompose.`9AlertDialogBox`

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.studyjetpackcompose.R
// 一个可组合函数，用来展示自定义对话框（Dialog）
@Composable
fun AlertDialogBoxSample() {
    // 获取当前上下文，用于 Toast
    val context = LocalContext.current

    // Dialog：弹出对话框
    Dialog(
        onDismissRequest = {
            // 点击空白区域或返回键时会触发，可以在这里写关闭逻辑
            // 这里暂时留空
        },
    ) {
        // 使用 Card 作为对话框的主要容器
        Card(
            modifier = Modifier
                .fillMaxWidth()     // 宽度铺满屏幕
                .height(350.dp)     // 固定高度 350dp
                .padding(16.dp),    // 外边距
            shape = RoundedCornerShape(16.dp) // 圆角矩形
        ) {
            // 对话框顶部展示一张图片
            Image(
                painter = painterResource(R.drawable.trees), // 读取 drawable 中的 trees 图片
                contentDescription = "这个是对话的图片",        // 图片描述（无障碍支持）
                contentScale = ContentScale.Crop,             // 裁剪填充
                modifier = Modifier
                    .height(160.dp) // 图片高度
                    .fillMaxWidth() // 图片宽度铺满
            )

            // 对话框内容文字
            Text(
                text = "这个是对话", // 显示文本
                modifier = Modifier.padding(16.dp) // 内边距
            )

            // 底部按钮区域（水平排列）
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center, // 按钮居中对齐
            ) {
                // “确定”按钮
                TextButton(
                    onClick = {
                        // 点击时弹出 Toast 提示
                        Toast.makeText(
                            context,
                            "你可以通过点击干成如何事",
                            Toast.LENGTH_SHORT
                        ).show()
                    },
                    modifier = Modifier.padding(8.dp) // 内边距
                ) {
                    Text("确定")
                }

                // “取消”按钮
                TextButton(
                    onClick = {
                        // TODO: 可以在这里写关闭逻辑
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text("取消")
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun AlertDialogBoxSamplePreview() {
    AlertDialogBoxSample()
}