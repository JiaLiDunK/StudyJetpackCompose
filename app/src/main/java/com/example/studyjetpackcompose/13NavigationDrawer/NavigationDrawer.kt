package com.example.studyjetpackcompose.`13NavigationDrawer`

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerSample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalBottomSheet(
                onDismissRequest = { false }
            ){
                Column (
                    modifier = Modifier
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState())
                ){
                    Text("抽屉的标题")
                    HorizontalDivider()
                    Text("抽屉的内容")
                }
                NavigationDrawerItem(
                    label = {
                        Text("抽屉的项目1")
                    },
                    selected = false,
                    onClick = {
                    }
                )
                NavigationDrawerItem(
                    label = {
                        Text("抽屉的项目2")
                    },
                    selected = false,
                    onClick = {
                    }
                )
            }
        },
        drawerState = drawerState,
    ) {
        Scaffold (
            topBar = {
                TopAppBar(
                    title = { Text("上导航栏") },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                if (drawerState.isClosed){
                                    scope.launch { drawerState.open() }
                                }else{
                                    scope.launch { drawerState.close() }
                                }
                            }
                        ) {
                            Icon(Icons.Default.Menu, contentDescription = "菜单")
                        }
                    }
                )
            }
            
        ){innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {

            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun NavigationDrawerSamplePreview() {
    NavigationDrawerSample()
}
