package com.vinish.ecovexhub.ui.updates.components

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen
import com.vinish.ecovexhub.theme.ViewAllBlue
import com.vinish.ecovexhub.ui.updates.SortOptions

@Composable
fun UpdatesHeader(
    selectedSort: SortOptions,
    onSortChange: (SortOptions) -> Unit,
    modifier: Modifier = Modifier,
) {
    // for sort drop down
    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Published Posts",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.weight(1f))


        // fixed width box to align dropdown to the right end
        Box(
            modifier = Modifier.width(180.dp)
        ) {
                Row(
                    modifier = Modifier.align(Alignment.TopEnd).clickable { expanded = !expanded },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Sort by: ${selectedSort.displayName}",
                        fontWeight = FontWeight.W500,
                        color = IconGreen
                    )
                    Icon(
                        painter = painterResource(if (!expanded) R.drawable.ic_dropdown else R.drawable.ic_dropup),
                        contentDescription = if (!expanded) "expand" else "collapse",
                        tint = IconGreen
                    )
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    offset = DpOffset(x = 65.dp, y = 4.dp)
                ) {
                    SortOptions.entries.forEach { sortOption ->

                        DropdownMenuItem(
                            text = { Text(text = sortOption.displayName) },
                            onClick = {
                                onSortChange(sortOption)
                                expanded = false
                            }
                        )
                    }

                }

        }

    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HeaderPreview() {
//    UpdatesHeader()
}