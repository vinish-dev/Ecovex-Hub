package com.vinish.ecovexhub.ui.home.components

import android.service.autofill.BatchUpdates
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.updatesList
import com.vinish.ecovexhub.model.Update
import com.vinish.ecovexhub.ui.components.SectionHeader
import com.vinish.ecovexhub.ui.components.UpdateCard

//@Preview(showSystemUi = true, showBackground = true)
@Composable
//todo: remove take 2
fun LatestUpdateSection(
    updates: List<Update>,
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
            updates.forEach {
                UpdateCard(update = it)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }

}