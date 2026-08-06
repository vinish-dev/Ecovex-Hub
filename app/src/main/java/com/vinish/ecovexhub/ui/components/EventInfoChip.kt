package com.vinish.ecovexhub.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinish.ecovexhub.R


@Preview(showSystemUi = true, showBackground = true,
    backgroundColor = 0xFF807C7C
)
@Composable
fun EventInfoChip(
    title: String = "05 Sep 2026",
    subtitle: String = "8:00 AM",
    iconRes: Int = R.drawable.ic_events_filled,
    subtitleStyle: TextStyle  = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.W400, fontSize = 12.sp),
    whiteText: Boolean = false,
    modifier: Modifier = Modifier
) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        //icon
        Box(
            modifier = modifier
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xFFEFF4E8))
                .size(40.dp),
            contentAlignment = Alignment.Center

        ) {
            Icon(
                modifier = Modifier.size(20.dp),
                painter = painterResource(iconRes),
                tint = Color(0xFF38763B),
                contentDescription = null
            )
        }
        // content
        Spacer(Modifier.width(12.dp))

        Column() {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                color = if (whiteText) Color.White else Color.Unspecified
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = subtitle,
                color = if (whiteText) Color.White else Color.Unspecified,
                style = subtitleStyle
            )
        }
    }
}