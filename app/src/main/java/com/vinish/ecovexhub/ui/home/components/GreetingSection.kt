package com.vinish.ecovexhub.ui.home.components

import android.R.attr.fontWeight
import android.R.attr.name
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight


@Composable
fun GreetingSection(
    modifier: Modifier = Modifier,
    name: String = "Ecovex User"
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Hello, $name",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Let's make our campus greener today!",
            style = MaterialTheme.typography.titleSmall
        )
    }
}