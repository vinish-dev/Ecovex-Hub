package com.vinish.ecovexhub.ui.updates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.postsList
import com.vinish.ecovexhub.ui.updates.components.PostCard
import com.vinish.ecovexhub.ui.updates.components.UpdatesHeader
import com.vinish.ecovexhub.ui.updates.components.UpdatesTopBar

@Composable
fun UpdatesScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            bottom = 16.dp
        )
    ) {
        item {
            UpdatesTopBar()
        }
        item {
            UpdatesHeader()
        }

        items(postsList){
            PostCard(post = it, onMoreClick = {})
        }

    }
}

@Preview
@Composable
fun UpdateScreenPreview(){

}