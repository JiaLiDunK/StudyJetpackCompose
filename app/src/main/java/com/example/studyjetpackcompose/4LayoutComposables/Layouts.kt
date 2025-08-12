package com.example.studyjetpackcompose.`4LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ColumnSample() {

        Column(
            modifier = Modifier.fillMaxSize()
                .background(color = Color.Red)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "文本1")
            Text(text = "文本2")
            Text(text = "文本3")
        }
}
@Composable
fun RowSample() {
    Row(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Green)
            .padding(10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "文本1")
        Text(text = "文本2")
        Text(text = "文本3")
    }
}

@Composable
fun BoxSample() {
    Box(
        modifier = Modifier.size(200.dp)
            .background(color = Color.Yellow)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ){
        Text(text = "文本1")
        Text(text = "文本2")
        Text(text = "文本3")
    }
}
@Composable
fun  ConstraintLayoutSample() {
    Column {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()        // 尽可能填满父容器的可用宽高
                .height(100.dp)       // 但这里额外限定高度为 100.dp
                .background(color = Color.Gray) // 背景色设为灰色，便于观察布局区域
        ) {
            // 为 ConstraintLayout 的子项分配参照
            val (ref1, ref2, ref3) = createRefs()

            // 左下角文本
            Text(
                text = "左下角1",
                modifier = Modifier.constrainAs(ref1) {
                    // bottom 链接到父容器的底部，偏移量 margin = 10.dp
                    bottom.linkTo(parent.bottom, margin = 10.dp)
                    // start 链接到父容器的左边，偏移量 margin = 10.dp
                    start.linkTo(parent.start, margin = 10.dp)
                }
            )

            // 中间文本，水平和垂直都居中（相对父容器的中心），但需要注意实际对齐的解释
            Text(
                text = "文本2",
                modifier = Modifier.constrainAs(ref2) {
                    // 顶部对齐到父容器顶部
                    top.linkTo(parent.top)
                    // 底部也对齐到父容器底部。结合这两个约束，文本会在纵向居中（在实际布局中，文本的高度会决定最终垂直对齐的位置）
                    bottom.linkTo(parent.bottom)
                    // 水平方向：起始端对齐到父容器左边
                    start.linkTo(parent.start)
                    // 结束端对齐到父容器右边
                    end.linkTo(parent.end)
                }
            )

            // 右上角文本
            Text(
                text = "文本3",
                modifier = Modifier.constrainAs(ref3) {
                    // 顶部对齐到父容器顶部
                    top.linkTo(parent.top)
                    // 结束端（右边）对齐到父容器的右边，带 margin = 10.dp
                    end.linkTo(parent.end, margin = 10.dp)
                }
            )
        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun ColumnPreview() {
//    ColumnSample()
//    RowSample()
//    BoxSample()
    ConstraintLayoutSample()
}