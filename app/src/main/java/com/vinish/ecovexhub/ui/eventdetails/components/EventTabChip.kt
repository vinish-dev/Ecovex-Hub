package com.vinish.ecovexhub.ui.eventdetails.components

import android.R.attr.textColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.EcovexGreen

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventTabChip(
    text: String = "Overview",
    selected: Boolean = false,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {



    // bg color change animation
//    val background by animateColorAsState(
//        targetValue = if (selected) EcovexGreen else Color.White,
//        label = ""
//    )

    // Text color change animation
//    val textColor by animateColorAsState(
//        targetValue = if (selected) Color.White else MaterialTheme.colorScheme.onSurface,
//        label = ""
//    )

    // background
    Surface(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        color = if (selected) EcovexGreen else Color.White,
        border = if (selected)
            null
        else
            BorderStroke(
                1.dp,
                BorderStoke
            )
    ) {

        Text(
            text = text,
            modifier = Modifier.padding(
                horizontal = 18.dp,
                vertical = 10.dp
            ),
            style = MaterialTheme.typography.labelLarge,
            color = if (selected) Color.White else MaterialTheme.colorScheme.onSurface
        )
    }
}