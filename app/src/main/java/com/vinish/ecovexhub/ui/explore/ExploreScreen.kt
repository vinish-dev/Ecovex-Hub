package com.vinish.ecovexhub.ui.explore

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.exploreBanners
import com.vinish.ecovexhub.ui.explore.components.ExploreBannerSection
import com.vinish.ecovexhub.ui.explore.components.ExploreSearchBar
import com.vinish.ecovexhub.ui.explore.components.ExploreTopBar
import com.vinish.ecovexhub.ui.explore.components.FeaturedTreesSection

@Composable
fun ExploreScreen(modifier: Modifier = Modifier) {
    var searchQuery by rememberSaveable { mutableStateOf("") }

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(
            horizontal = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            ExploreTopBar()
        }

        item {
            ExploreSearchBar(query = searchQuery, onQueryChange = { searchQuery = it })
        }

        item {
            ExploreBannerSection(banners = exploreBanners)
            FeaturedTreesSection()

        }
        item {
        }
    }
}