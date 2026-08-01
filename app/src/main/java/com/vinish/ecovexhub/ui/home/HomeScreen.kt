package com.vinish.ecovexhub.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.EventList
import com.vinish.ecovexhub.data.fake.statList
import com.vinish.ecovexhub.data.fake.updatesList
import com.vinish.ecovexhub.ui.home.components.GreetingSection
import com.vinish.ecovexhub.ui.home.components.HomeTopBar
import com.vinish.ecovexhub.ui.home.components.LatestUpdateSection
import com.vinish.ecovexhub.ui.home.components.OverviewSection
import com.vinish.ecovexhub.ui.home.components.TreeExplorerCard
import com.vinish.ecovexhub.ui.home.components.UpcomingEventsSection

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreen( modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ){
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

            //Latest updates section
            LatestUpdateSection(updates = updatesList.take(1))

            //Upcoming events section
            UpcomingEventsSection(events = EventList.take(2))

            //to prevent overlapping with bottom bar
//            Spacer(Modifier.height(64.dp))
        }


    }

}