package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.trees
import com.vinish.ecovexhub.ui.components.SectionHeader

@Composable
fun FeaturedTreesSection(modifier: Modifier = Modifier) {
    Column() {
        SectionHeader(
            title = "Featured Trees",
            showViewAll = true,
            onViewAllClick = {}
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(trees){
                TreeCard(tree = it)
            }
        }
    }
}