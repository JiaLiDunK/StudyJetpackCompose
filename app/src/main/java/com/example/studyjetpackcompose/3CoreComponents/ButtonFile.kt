package com.example.studyjetpackcompose.`3CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ButtonFileSample() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
//        Button(
//            onClick = {
//                Toast.makeText(context,"按钮被点击了",Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("按钮")
//        }
//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context,"按钮被点击了",Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("按钮")
//        }
//        OutlinedButton(
//            onClick = {
//
//            }
//        ) {
//            Text("按钮")
//        }
//        ElevatedButton(
//            onClick = {
//
//            }
//        ) {
//            Text("按钮")
//        }
        TextButton(
            onClick = {

            }
        ) {
            Text("按钮")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonFilePreview() {
    ButtonFileSample()
}