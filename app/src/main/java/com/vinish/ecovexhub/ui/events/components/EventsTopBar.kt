package com.vinish.ecovexhub.ui.events.components

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventsTopBar(
    isSearching: Boolean,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onSearchClick: () -> Unit,
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit),
) {

    //topBar, when tapped on search icon
    AnimatedContent(
        targetState = isSearching,
        label = "SearchTransition"
    ) { searching ->
        if (searching) {
            SearchTopBar(
                searchQuery = searchQuery,
                onSearchQueryChange = onSearchQueryChange,
                onBackClick = onBackClick,
                modifier = modifier
            )
        } else {
            NormalTopBar(
                onSearchClick = onSearchClick,
                modifier = modifier
            )
        }
    }

}


@Composable
private fun NormalTopBar(
    modifier: Modifier = Modifier,
    onSearchClick: () -> Unit
) {
    Row(
        modifier = modifier.padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        //screen title
        Text(
            text = "Events",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.weight(1f))

        IconButton(
            onClick = onSearchClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = null
            )
        }
        Spacer(Modifier.width(6.dp))
    }
}

@Composable
private fun SearchTopBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier

) {
    // auto focus
    val focusRequester = remember { FocusRequester() }

    //main row
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        //normal text field
        TextField(
            value = searchQuery,
            onValueChange = onSearchQueryChange,
            singleLine = true,

            modifier = Modifier
                .fillMaxWidth()
                .focusRequester(focusRequester),

            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),

            placeholder = {
                Text("Search events...")
            },

            //back icon
            leadingIcon = {
                IconButton(
                    onClick = onBackClick
                ) {
                    Icon(painterResource(R.drawable.ic_back), contentDescription = "Back")
                }
            },

            // search icon
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(
                        onClick = {
                            onSearchQueryChange("")
                        }
                    ) {
                        Icon(painterResource(R.drawable.ic_close), "Clear")
                    }
                }
            }
        )// text field

        // request focus, when composable is created
        LaunchedEffect(Unit) {
            focusRequester.requestFocus()
        }

    }// row
}