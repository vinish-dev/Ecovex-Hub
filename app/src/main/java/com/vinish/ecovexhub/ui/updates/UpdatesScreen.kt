package com.vinish.ecovexhub.ui.updates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.ui.updates.components.UpdatesHeader
import com.vinish.ecovexhub.ui.updates.components.UpdatesTopBar

@Composable
fun UpdatesScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        UpdatesTopBar()
        UpdatesHeader()
    }
}

@Preview
@Composable
fun UpdateScreenPreview(){

}