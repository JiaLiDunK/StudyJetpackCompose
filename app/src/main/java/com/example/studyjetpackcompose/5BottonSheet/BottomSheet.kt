package com.example.studyjetpackcompose.`5BottonSheet`


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PartialBottomSheet() {
    var showBottomSheet by remember {
        mutableStateOf(false)
    }
    var sheetState = rememberModalBottomSheetState (
        skipPartiallyExpanded = false
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                showBottomSheet = true
            }
        ) {
            Text("显示底部弹出层")
        }
        if (showBottomSheet) {
            ModalBottomSheet(
                modifier = Modifier.fillMaxSize(),
                sheetState = sheetState,
                onDismissRequest = {
                    showBottomSheet = false
                },
            ) {
                Text("底部弹出层内容",
                    modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PartialBottomSheetPreview() {
    PartialBottomSheet()
}