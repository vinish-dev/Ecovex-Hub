package com.vinish.ecovexhub.ui.profile.components

import android.util.Log.d
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.EcovexGreen

@Composable
fun ProfileTopBar(
    onBellIconClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Text(
                text = "Profile",
                style = MaterialTheme.typography.headlineMedium,
                color = EcovexGreen,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Manage your profile and activity ",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
        }

        IconButton(
            onClick = onBellIconClick
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_bell),
                contentDescription = "Notifications"
            )
        }
    }
}