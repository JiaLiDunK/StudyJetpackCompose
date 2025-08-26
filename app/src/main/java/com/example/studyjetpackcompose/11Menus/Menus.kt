package com.example.studyjetpackcompose.`11Menus`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DropDownMenusSample() {
    var expanded by remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ){
        Box(
            modifier = Modifier.padding(16.dp)
        ){
            IconButton(
                onClick = {
                    expanded = !expanded
                }
            ) {
                Icon(Icons.Default.MoreVert, contentDescription = "这个是那三个小点")
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = {
                        expanded = false
                    }
                ) {
                    DropdownMenuItem(
                        text = {
                            Text("个人资料")
                        },
                        trailingIcon = {
                            Icon(Icons.Outlined.Person,
                                contentDescription = "个人资料")
                        },
                        onClick = {
                            //to do
                        }
                    )
                    DropdownMenuItem(
                        text = {
                            Text("设置")
                        },
                        trailingIcon = {
                            Icon(Icons.Outlined.Settings,
                                contentDescription = "设置")
                        },
                        onClick = {
                            //to do
                        }
                    )
                    HorizontalDivider()
                    DropdownMenuItem(
                        text = {
                            Text("关于")
                        },
                        trailingIcon = {
                            Icon(Icons.Outlined.Face,
                                contentDescription = "关于")
                        },
                        onClick = {
                            //to do
                        }
                    )
                }
            }
        }
    }

}
@Preview(showSystemUi = true)
@Composable
fun MenusPreview() {
    DropDownMenusSample()
}