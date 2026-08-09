package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.timeline
import com.vinish.ecovexhub.model.Event

@Composable
fun EventTimelineTab(
    event: Event,
    modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Coming soon...")

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            event.timeline.forEachIndexed {  index, item ->
                TimelineItem(
                    title = item.title,
                    time = "",
                    date = item.date,
                    isCompleted = item.isCompleted,
                    isLast = index == timeline.lastIndex
                )
            }
        }
    }
}