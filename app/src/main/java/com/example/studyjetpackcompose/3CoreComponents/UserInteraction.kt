package com.example.studyjetpackcompose.`3CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PartiallySelectedTextField() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        SelectionContainer {
            Column {
                Text("这是可选文本1")
                Text("这是可选文本2")
                Text("这是可选文本3")
                DisableSelection {
                    Text("这是不可选文本1")
                    Text("这是不可选文本2")
                    Text("这是不可选文本3")
                }
            }
        }
    }
}

@Composable
fun AnnotatedStringWithListSample(){
    val urlHandler = LocalUriHandler.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
       Text(
           buildAnnotatedString {
               append("点击送你一百万\n")
               val link = LinkAnnotation.Url(
                   "https://www.baidu.com",
                   TextLinkStyles(
                       SpanStyle(
                           color = Color.Blue
                       )
                   )
               ){
                   val url = (it as LinkAnnotation.Url).url
                   urlHandler.openUri(url)
               }
               withLink(link){
                   append("百度")
               }
           }
       )
    }
}
@Preview(showSystemUi = true)
@Composable
fun PartiallySelectedTextFieldPreview() {
    AnnotatedStringWithListSample()
}








