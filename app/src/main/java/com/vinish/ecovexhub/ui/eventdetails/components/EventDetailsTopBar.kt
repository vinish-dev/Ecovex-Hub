package com.vinish.ecovexhub.ui.eventdetails.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R

@Composable
fun EventDetailsTopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        //back button
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_back),
                contentDescription = "Back"
            )
        }

        //move content to end
        Spacer(Modifier.weight(1f))

        //bookmark button
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_bookmark),
                contentDescription = "Bookmark"
            )
        }

        //share button
        IconButton(
            onClick = {}
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_share),
                contentDescription = "Share"
            )
        }

    }
}