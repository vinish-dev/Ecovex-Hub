package com.vinish.ecovexhub.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.eventList
import com.vinish.ecovexhub.data.fake.postsList
import com.vinish.ecovexhub.data.fake.statList
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.ui.home.components.GreetingSection
import com.vinish.ecovexhub.ui.home.components.HomeTopBar
import com.vinish.ecovexhub.ui.home.components.LatestUpdateSection
import com.vinish.ecovexhub.ui.home.components.OverviewSection
import com.vinish.ecovexhub.ui.home.components.TreeExplorerCard
import com.vinish.ecovexhub.ui.home.components.UpcomingEventsSection

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onEventClick: (Event) -> Unit
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        item {
            //top bar
            HomeTopBar(
                onProfileClick = {},
                onNotificationClick = {}
            )

            //hello section
            GreetingSection(
                name = "Vinish"
            )

            //tree explorer section
            TreeExplorerCard(
                onScanClick = {},
                modifier = Modifier.padding(vertical = 16.dp)
            )

            //Overview Section
            OverviewSection(
                stats = statList
            )


            //Upcoming events section
            UpcomingEventsSection(events = eventList.take(2), onEventClick = onEventClick)

            //Latest updates section
            LatestUpdateSection(posts = listOf(postsList[2]))

        }


    }

}