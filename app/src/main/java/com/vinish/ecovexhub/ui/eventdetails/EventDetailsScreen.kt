package com.vinish.ecovexhub.ui.eventdetails

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.vinish.ecovexhub.ui.eventdetails.components.EventDetailsTopBar

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsDetailsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {

        EventDetailsTopBar()

    }
}