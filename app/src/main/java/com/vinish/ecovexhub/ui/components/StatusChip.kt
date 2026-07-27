package com.vinish.ecovexhub.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.theme.InfoContainer
import com.vinish.ecovexhub.theme.NeutralContainer
import com.vinish.ecovexhub.theme.OnInfoContainer
import com.vinish.ecovexhub.theme.OnNeutralContainer
import com.vinish.ecovexhub.theme.OnSuccessContainer
import com.vinish.ecovexhub.theme.SuccessContainer

@Composable
fun StatusChip(
    status: EventStatus,
    modifier: Modifier = Modifier
) {

    val (text, containerColor, textColor) = when (status) {
        EventStatus.UPCOMING -> Triple("Upcoming", InfoContainer, OnInfoContainer)
        EventStatus.ONGOING -> Triple("Ongoing", SuccessContainer, OnSuccessContainer)
        EventStatus.COMPLETED -> Triple("Completed", NeutralContainer, OnNeutralContainer)

    }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(999.dp))
            .background(containerColor)
            .padding(horizontal = 10.dp, vertical = 5.dp),
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            color = textColor,
        )
    }

}