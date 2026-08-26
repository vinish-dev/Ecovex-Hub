package com.vinish.ecovexhub.ui.updates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.data.fake.postsList
import com.vinish.ecovexhub.model.Post
import com.vinish.ecovexhub.ui.updates.components.PostCard
import com.vinish.ecovexhub.ui.updates.components.UpdatesHeader
import com.vinish.ecovexhub.ui.updates.components.UpdatesTopBar

@Composable
fun UpdatesScreen(modifier: Modifier = Modifier) {

    // logic

    var selectedSort by remember { mutableStateOf(SortOptions.LATEST) }

    val sortedPost =
        when(selectedSort){
            SortOptions.LATEST -> postsList.sortedByDescending{it.createdAt}
            SortOptions.MOST_LIKED -> postsList.sortedByDescending { it.likes }
            SortOptions.MOST_VIEWED -> postsList.sortedByDescending { it.views }
        }


    // ui
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
            UpdatesHeader(onSortChange = {option -> selectedSort = option}, selectedSort = selectedSort, modifier = Modifier.padding(top = 10.dp))
        }

        items(sortedPost){
            PostCard(post = it, onMoreClick = {})
        }

    }
}

@Preview
@Composable
fun UpdateScreenPreview(){
UpdatesScreen(modifier = Modifier.statusBarsPadding())
}

enum class SortOptions(val displayName: String){
    LATEST("Latest"),
    MOST_LIKED("Most Liked"),
    MOST_VIEWED("Most Viewed")
}