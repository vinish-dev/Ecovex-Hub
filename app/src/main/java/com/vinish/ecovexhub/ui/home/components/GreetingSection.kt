package com.vinish.ecovexhub.ui.home.components

import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight


@Composable
fun GreetingSection(modifier: Modifier = Modifier) {
    Column() {
        Text(
            text = "Hello, Vinish",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Let's make our campus greener today!",
            style = MaterialTheme.typography.titleMedium
        )
    }
}