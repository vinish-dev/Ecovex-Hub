package com.vinish.ecovexhub.ui.eventdetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.eventList
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventDetailsTab
import com.vinish.ecovexhub.ui.components.HeroBannerCard
import com.vinish.ecovexhub.ui.eventdetails.components.EventDetailsTopBar
import com.vinish.ecovexhub.ui.eventdetails.components.EventGalleryTab
import com.vinish.ecovexhub.ui.eventdetails.components.EventLeaderboardTab
import com.vinish.ecovexhub.ui.eventdetails.components.EventOverviewTab
import com.vinish.ecovexhub.ui.eventdetails.components.EventTabBar
import com.vinish.ecovexhub.ui.eventdetails.components.EventTimelineTab
import com.vinish.ecovexhub.ui.eventdetails.components.RegisterSection


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsDetailsScreen(
    event: Event = eventList[2],
    modifier: Modifier = Modifier
) {
    var selectedTab by rememberSaveable { mutableStateOf(EventDetailsTab.Overview) }

    Scaffold(
        bottomBar = {
            RegisterSection(onRegClick = {}, onHeartClick = {}, modifier = Modifier.padding(16.dp))}
    ) {  innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding).padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(22.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {

            item {
                EventDetailsTopBar()
                Spacer(Modifier.height(8.dp))
                HeroBannerCard(
                    event = event
                )
            }

            item {
                EventTabBar(
                    selectedTab = selectedTab,
                    onTabSelected = { selectedTab = it }
                )
            }


            item {
                TabContent(selectedTab = selectedTab, event = event)
            }

        }
    }

}


// tab content selector
@Composable
private fun TabContent(
    selectedTab: EventDetailsTab,
    event: Event
) {
    when (selectedTab) {
        EventDetailsTab.Overview -> EventOverviewTab(event)
        EventDetailsTab.Timeline -> EventTimelineTab(event, modifier = Modifier.padding(16.dp))
        EventDetailsTab.Gallery -> EventGalleryTab(event)
        EventDetailsTab.Leaderboard -> EventLeaderboardTab(event)
    }
}