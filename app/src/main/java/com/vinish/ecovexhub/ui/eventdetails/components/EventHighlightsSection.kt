package com.vinish.ecovexhub.ui.eventdetails.components

import android.util.Log.v
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.data.fake.highlights
import com.vinish.ecovexhub.model.EventHighlight
import com.vinish.ecovexhub.ui.components.CardSectionTitle

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun EventHighlightSection(
    eventHighlights: List<EventHighlight> = highlights,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        border = BorderStroke(width = 1.dp, color = Color(0xFFE9ECEF))
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            CardSectionTitle(
                startIcon = R.drawable.ic_kidstar_filled,
                sectionTitle = "Event Highlights"
            )
            Spacer(Modifier.height(16.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 2.dp)
            ) {
                items(eventHighlights) { highlight ->
                    EventHighlightCard(
                        text = highlight.title,
                        icon = highlight.iconRes
                    )
                }
            }
        }
    }
}
