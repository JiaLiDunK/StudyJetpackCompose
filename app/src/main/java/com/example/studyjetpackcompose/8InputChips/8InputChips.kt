package com.example.studyjetpackcompose.`8InputChips`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle

import androidx.compose.ui.tooling.preview.Preview


// 一个可组合函数，展示 InputChip 的用法
@Composable
fun InputChipsSample() {
    // 定义一个布尔状态，用来控制 Chip 是否显示
    var enable by remember {
        mutableStateOf(true)
    }

    // 使用 Box 让 Chip 居中显示
    Box(
        modifier = Modifier.fillMaxSize(),        // 占满全屏
        contentAlignment = Alignment.Center       // 内容居中
    ) {
        // 如果 enable 为 true，则显示 InputChip
        if (enable) {
            InputChip(
                onClick = {
                    // 点击时切换状态（点击后会让 enable = false，从而 Chip 消失）
                    enable = !enable
                },
                label = {
                    // Chip 中间的文字
                    Text("启动")
                },
                selected = enable, // Chip 是否处于选中状态（true 时显示选中样式）

                // 左侧头像图标
                avatar = {
                    Icon(
                        Icons.Filled.Person,         // 使用系统自带的 "Person" 图标
                        contentDescription = "加载的表述", // 图标的无障碍描述
                        modifier = Modifier.size(InputChipDefaults.AvatarSize) // 头像大小
                    )
                },

                // 右侧的关闭图标
                trailingIcon = {
                    Icon(
                        Icons.Filled.Close,          // 使用系统自带的 "关闭" 图标
                        contentDescription = "加载的表述",
                        modifier = Modifier.size(InputChipDefaults.AvatarSize) // 图标大小
                    )
                }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun InputChipsPreview() {
    InputChipsSample()
}