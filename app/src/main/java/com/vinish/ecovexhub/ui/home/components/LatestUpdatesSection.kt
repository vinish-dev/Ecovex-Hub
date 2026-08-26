package com.vinish.ecovexhub.ui.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

import com.vinish.ecovexhub.model.Post

import com.vinish.ecovexhub.ui.components.SectionHeader

import com.vinish.ecovexhub.ui.updates.components.PostCard
import com.vinish.ecovexhub.ui.updates.components.PostCardHomeScreen

//@Preview(showSystemUi = true, showBackground = true)
@Composable
//todo: remove take 2
fun LatestUpdateSection(
    posts: List<Post>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            title = "Latest Updates",
            showViewAll = true,
            onViewAllClick = {}
        )
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            posts.forEach {
                PostCardHomeScreen(post = it, onMoreClick = {})
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }

}