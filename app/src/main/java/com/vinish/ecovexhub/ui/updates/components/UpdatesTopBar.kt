package com.vinish.ecovexhub.ui.updates.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults.contentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.theme.EcovexGreen
import com.vinish.ecovexhub.theme.IconGreen

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun UpdatesTopBar(
    modifier: Modifier = Modifier,
    onCreate: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth().statusBarsPadding(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        //screen title
        Text(
            text = "Posts",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )



        Button(
            onClick = onCreate,
            colors = ButtonDefaults.buttonColors(
                containerColor = IconGreen
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.height(34.dp),
            contentPadding = PaddingValues(
                vertical = 0.dp,
                horizontal = 10.dp
            )

        ) {
            Icon(
                painter = painterResource(R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Spacer(Modifier.width(4.dp))
            Text(
                text = "Create Post",
                textAlign = TextAlign.Center
            )
        }

    }
}