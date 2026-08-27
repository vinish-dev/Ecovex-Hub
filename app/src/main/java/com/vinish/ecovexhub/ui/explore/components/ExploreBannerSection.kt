package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.ui.explore.model.ExploreBanner
import kotlinx.coroutines.delay

@Composable
fun ExploreBannerSection(
    banners: List<ExploreBanner>,
    modifier: Modifier = Modifier
) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { banners.size }
    )

    LaunchedEffect(banners.size) {
        while (true) {
            delay(4500)

            if (!pagerState.isScrollInProgress) {
                val nextPage = (pagerState.currentPage + 1) % banners.size

                pagerState.animateScrollToPage(nextPage)
            }
        }
    }

    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .clip(RoundedCornerShape(20.dp))
        ) { page ->

            ExploreBannerCard(
                banner = banners[page]
            )

        }

        Spacer(Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            repeat(banners.size) { index ->

                val selected = pagerState.currentPage == index

                Box(
                    modifier = Modifier
                        .padding(horizontal = 3.dp)
                        .size(if (selected) 8.dp else 7.dp)
                        .clip(CircleShape)
                        .background(if (selected) EcovexGreen else Color.LightGray)
                )
            }
        }
    }
}