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

@Composable
fun ImageSample() {
    val rainbow = remember {
        Brush.sweepGradient(
            colors = listOf(
                Color.Red,
                Color.Yellow,
                Color.Green,
                Color.Blue,
                Color.Magenta
            )
        )
    }
    val borderWidth = 10.dp

    Image(
        painter = painterResource(R.drawable.trees),
        contentDescription = "trees",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(300.dp)
//            .clip(CircleShape)
            .border(
                BorderStroke(borderWidth, rainbow),
            ),
        alignment =  Alignment.Center,
        colorFilter = ColorFilter.colorMatrix(
            ColorMatrix().apply {
                setToSaturation(0f)
            }
        )
    )
}

@Preview(showSystemUi = true)
@Composable
fun ImagePreview() {
    ImageSample()
}
