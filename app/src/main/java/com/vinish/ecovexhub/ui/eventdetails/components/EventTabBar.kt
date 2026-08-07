package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private val tabs = listOf(
    "Overview",
    "Timeline",
    "Gallery",
    "Leaderboard"
)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventTabBar(
    selectedTab: Int = 1,
    onTabSelected: (Int) -> Unit = {},
    modifier: Modifier = Modifier
) {

    PrimaryTabRow(
        selectedTabIndex = selectedTab,
        modifier = modifier
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTab == index,
                onClick = { onTabSelected(index) },
                text = { Text(title) }
            )
        }
    }
}