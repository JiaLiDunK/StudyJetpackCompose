package com.example.studyjetpackcompose.`7CheckBox`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.fastForEachIndexed

@Composable
fun CheckBoxSample() {
    // 子选项的选中状态，使用 remember 保存，避免重组后丢失
    val childCheckedStates = remember {
        mutableListOf(false, false, false) // 初始都未选中
    }

    // 父复选框（三态复选框）的状态根据子选项动态计算
    val parentState = when {
        childCheckedStates.all { it } -> ToggleableState.On            // 如果全部子选项选中 → 父为选中
        childCheckedStates.none() -> ToggleableState.Off               // 如果全部子选项未选中 → 父为未选中
        else -> ToggleableState.Indeterminate                          // 如果部分选中 → 父为不确定
    }

    // 外层垂直布局，居中显示
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 父复选框行
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("全选") // 父选项文字

            TriStateCheckbox(
                state = parentState, // 设置父复选框的三态状态
                onClick = {
                    // 点击父复选框时，切换全选或全不选
                    val newSate = parentState != ToggleableState.On
                    // 将所有子选项的状态改为 newSate
                    childCheckedStates.fastForEachIndexed { index, _ ->
                        childCheckedStates[index] = newSate
                    }
                }
            )
        }

        // 遍历子选项，逐一绘制
        childCheckedStates.forEachIndexed { index, checked ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("子选项${index + 1}") // 子选项文字
                Checkbox(
                    checked = checked, // 当前子选项的选中状态
                    onCheckedChange = {
                        childCheckedStates[index] = it // 修改对应子选项状态
                    }
                )
            }
        }
    }

    // 如果所有子选项都选中了，就额外显示一行提示
    if (childCheckedStates.all { it }) {
        Text("全选")
    }
}



@Preview(showSystemUi = true)
@Composable
fun CheckBoxSampleExample(){
    CheckBoxSample(

    )
}