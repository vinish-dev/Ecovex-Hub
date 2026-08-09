package com.vinish.ecovexhub.ui.eventdetails.components

import android.R.attr.onClick
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen

@Composable
fun RegisterSection(
    onRegClick: () -> Unit,
    onHeartClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Button (
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4d763d)
            ),
            shape = RoundedCornerShape(12.dp),
            onClick = onRegClick,
            modifier = Modifier.weight(0.6f)
        ){
            Icon(
                painter = painterResource(R.drawable.ic_brand_sapling),
                contentDescription = null
            )
            Text(" Register Now")
        }

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor= Color(0xFFEFF4E8)
            ),
            shape = RoundedCornerShape(12.dp),
            onClick = onRegClick,
            border = BorderStroke(1.dp, BorderStoke)
        ){
            Icon(
                painter = painterResource(R.drawable.ic_bookmark),
                contentDescription = null,
                tint = IconGreen
            )
            Text(text = " Interested", color = IconGreen)
        }
    }
}