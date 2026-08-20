package com.vinish.ecovexhub.ui.events

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.vinish.ecovexhub.data.fake.eventList
import com.vinish.ecovexhub.model.Event
import com.vinish.ecovexhub.model.EventStatus
import com.vinish.ecovexhub.ui.components.EventCard
import com.vinish.ecovexhub.ui.events.components.EventFilterBar
import com.vinish.ecovexhub.ui.events.components.EventsTopBar

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsScreen(
    onEventClick: (Event) -> Unit,
    modifier: Modifier = Modifier
) {


    //TODO: Move search state to EventsViewModel.

    var selectedFilter by rememberSaveable { mutableStateOf<EventStatus?>(null) }

    var isSearching by rememberSaveable { mutableStateOf(false) }

    var searchQuery by rememberSaveable { mutableStateOf("") }


    // TODO(ViewModel): Move filtering logic to EventsViewModel.

    val filteredEvents = eventList.filter { event ->
        // include this event if search query is empty or search contains this event
        val matchesSearch =
            searchQuery.isBlank() ||
                    event.title.contains(searchQuery, ignoreCase = true) ||
                    event.category.displayName.contains(searchQuery, ignoreCase = true)

        // check if this event's category = selected filter
        val matchesFilter =
            selectedFilter ==
                    null||
                    event.status == selectedFilter

        matchesFilter && matchesSearch
    }


    Column(
        modifier = modifier.fillMaxSize()
    ) {

        // top bar
        EventsTopBar(
            isSearching = isSearching,
            searchQuery = searchQuery,
            onSearchClick = { isSearching = true },
            onSearchQueryChange = { searchQuery = it },
            onBackClick = { isSearching = false },
            modifier = Modifier.background(Color.White)
        )

        // filter bar
        EventFilterBar(
            selectedFilter = selectedFilter,
            onClick = { filter -> selectedFilter = filter },
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )

        //events column
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                horizontal = 16.dp
            ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(filteredEvents) { event ->
                EventCard(
                    event = event,
                    onClick = { onEventClick(event) } //pass lambda that has a func call
                )
            }
        }
    }
}