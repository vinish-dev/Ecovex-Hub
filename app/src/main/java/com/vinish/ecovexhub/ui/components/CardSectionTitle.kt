package com.vinish.ecovexhub.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun CardSectionTitle(
    startIcon: Int,
    sectionTitle: String,
    modifier: Modifier = Modifier,
    iconTint: Color = Color(0xFF598044)

) {
    //icon and heading
    Row(verticalAlignment = Alignment.CenterVertically) {
        //start icon
        Icon(
            painter = painterResource(startIcon),
            contentDescription = null,
            tint = iconTint
        )
        Spacer(Modifier.width(4.dp))

        //heading
        Text(
            text = sectionTitle,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold
        )
    }
}