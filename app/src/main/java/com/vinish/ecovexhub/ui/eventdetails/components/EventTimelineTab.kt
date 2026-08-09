package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.Event

@Composable
fun EventTimelineTab(
    event: Event,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {

        event.timeline.forEachIndexed { index, item ->
            TimelineItem(
                title = item.title,
                time = "",
                date = item.date,
                isCompleted = item.isCompleted,
                isCurrent = item.isCurrent,
                isLast = index == event.timeline.lastIndex
            )
        }
    }
}
