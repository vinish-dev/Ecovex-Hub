package com.vinish.ecovexhub.ui.eventdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.ui.components.HeroBannerCard
import com.vinish.ecovexhub.ui.components.StatusChip
import com.vinish.ecovexhub.ui.eventdetails.components.EventDetailsTopBar

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsDetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {

        EventDetailsTopBar()
        Spacer(Modifier.height(16.dp))
        HeroBannerCard(modifier = Modifier.padding(horizontal = 16.dp))


    }
}