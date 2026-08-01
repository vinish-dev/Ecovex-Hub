package com.vinish.ecovexhub.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.statList
import com.vinish.ecovexhub.model.OverviewStat
import com.vinish.ecovexhub.ui.components.SectionHeader
import com.vinish.ecovexhub.ui.components.StatCard

//@Preview(showBackground = true, showSystemUi = true)

@Composable
fun OverviewSection(stats: List<OverviewStat>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(title = "Overview", showViewAll = false)

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues( vertical = 8.dp, horizontal = 2.dp )
        ) {
            items(stats){ state ->
                StatCard(stat = state)

            }
        }
    }
    
}