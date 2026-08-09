package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TimelineItem(
    title: String = "Registration Opens ",
    time: String = "8:00 AM",
    date: String = "05 Sep 2026",
    isLast: Boolean = false,
    isCompleted: Boolean = false,
    isCurrent: Boolean = false,
    modifier: Modifier = Modifier
) {
    val dotColor:Color =  when{
        isCurrent -> Color(0xFF479A40)
        isCompleted -> Color(0xFF479A40)
        else -> Color(0xFFE0E0E0)
    }

    val lineColor = if (isCompleted) Color(0xFF479A40) else Color(0xFFE0E0E0)

    Row(
        modifier = modifier.fillMaxWidth()
    ) {

        // content center aligned column
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // dot
            Box(
                modifier = Modifier
                    .size(14.dp)
                    .background(color = dotColor, shape = CircleShape)
            )

            // connecting line
            if (!isLast) {
                Box(
                    modifier = Modifier
                        .width(2.dp)
                        .height(60.dp)
                        .background(color = lineColor)
                )
            }

        }
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
            )
            Text(
                text = "$date    $time",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )


        }
    }
}