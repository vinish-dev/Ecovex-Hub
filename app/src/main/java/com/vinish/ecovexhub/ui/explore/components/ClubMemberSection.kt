package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.ClubMember
import com.vinish.ecovexhub.ui.components.SectionHeader

@Composable
fun ClubMemberSection(
    clubMembers: List<ClubMember>,
    modifier: Modifier = Modifier) {

    Column() {
        SectionHeader(
            title = "Meet the Team",
            showViewAll = true,
            onViewAllClick = {}
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(clubMembers) {
                ClubMemberCard(clubMember = it)
            }
        }
    }
}