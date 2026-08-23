package com.vinish.ecovexhub.ui.updates.components

import android.R.attr.text
import android.R.attr.textColor
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.model.PostType
import com.vinish.ecovexhub.theme.InfoContainer
import com.vinish.ecovexhub.theme.OnInfoContainer

@Composable
fun PostTypeChip(
    type: PostType,
    modifier: Modifier = Modifier
) {

//    val (text, containerColor, textColor) = when (type) {
//        PostType.EVENT -> Triple("EVENT", InfoContainer, OnInfoContainer)
//        PostType.ANNOUNCEMENT -> Triple("ANNOUNCEMENT", Color(0xFFfcf2db), Color(0xFF8f621f))
//    }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(999.dp))
            .background(type.bg)
            .padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        Text(
            text = type.name,
            style = MaterialTheme.typography.labelMedium,
            color = type.tint.copy(0.8f),
        )
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PostTypeChipPreview(){
    PostTypeChip(PostType.DEADLINE)
}