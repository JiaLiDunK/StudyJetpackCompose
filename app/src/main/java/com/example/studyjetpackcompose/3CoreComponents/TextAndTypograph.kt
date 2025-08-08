package com.example.studyjetpackcompose.`3CoreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.StringBuilder


@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text("你好啊！白雪公主",color = Color.Red,
            fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Green,
                    blurRadius = 10f
                )),
            )
    }
}

@Composable
fun ColorFullText() {
    val rainbowColors = listOf(
        Color.Red,
        Color.Yellow,
        Color.Green,
        Color.Blue,
        Color.Magenta
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = buildAnnotatedString {
                append("你好啊！后世的君子们 \n")
                withStyle(
                    style = SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColors
                        )
                    )
                ) {
                    append("这是来自千年前的问候 \n")
                }
                append("桀桀 \n")
            }
        )
    }
}

@Composable
fun ScrollableText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "噫嘘唏,危呼高哉,蜀道之难,难于上青天".repeat(50),
            maxLines = 2,
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis,
            )
    }
}


@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview() {
    ScrollableText()
}