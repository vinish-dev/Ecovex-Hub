package com.vinish.ecovexhub.ui.eventdetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.ui.components.HeroBannerCard
import com.vinish.ecovexhub.ui.components.StatusChip
import com.vinish.ecovexhub.ui.eventdetails.components.EventDetailsTopBar
import com.vinish.ecovexhub.ui.eventdetails.components.EventHighlightSection

import com.vinish.ecovexhub.ui.eventdetails.components.EventOverviewCard

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsDetailsScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {

        item {
            EventDetailsTopBar()
            Spacer(Modifier.height(8.dp))
            HeroBannerCard()
        }

        item {
            EventOverviewCard()
        }

        item {
            EventHighlightSection()

        }

    }
}