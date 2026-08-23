package com.vinish.ecovexhub.ui.updates.components

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.IconGreen
import com.vinish.ecovexhub.theme.ViewAllBlue

@Composable
fun UpdatesHeader(
    modifier: Modifier = Modifier,
    onSortByClick:() -> Unit = {}
) {
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


        TextButton(onClick = onSortByClick) {
            Text(
                text = "Sort by: Latest",
                fontWeight = FontWeight.Bold
            )
            Icon(
                painter = painterResource(R.drawable.ic_dropdown),
                contentDescription = null
            )
        }

    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HeaderPreview() {
    UpdatesHeader()
}