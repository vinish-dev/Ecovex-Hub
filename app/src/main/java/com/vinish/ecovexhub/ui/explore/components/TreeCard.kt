package com.vinish.ecovexhub.ui.explore.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.data.fake.trees
import com.vinish.ecovexhub.model.Tree
import com.vinish.ecovexhub.theme.BorderStoke
import com.vinish.ecovexhub.theme.EcovexGreen

@Composable
fun TreeCard(
    tree: Tree,
    modifier: Modifier = Modifier
) {

    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            width = 1.dp,
            color = BorderStoke
        ),
        modifier = modifier.width(200.dp),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column {
            Image(
                modifier = Modifier.height(110.dp),
                painter = painterResource(tree.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp)
            ) {


                Text(
                    text = tree.name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold
                )

                Text(
                    text = tree.scientificName,
                    style = MaterialTheme.typography.bodySmall,
                    fontStyle = FontStyle.Italic,
                    color = Color.DarkGray.copy(0.9f)
                )

                Spacer(Modifier.height(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_location),
                        contentDescription = null,
                        tint = EcovexGreen.copy(alpha = 0.7f),
                        modifier = Modifier.size(16.dp)
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Text(
                        text = tree.location,
                        color = Color.DarkGray,
                        style = MaterialTheme.typography.bodySmall
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Surface(
                    shape = RoundedCornerShape(50),
                    color = Color(0xFFEAF5E8)
                ) {
                    Text(
                        text = "Age: ${tree.age}",
                        style = MaterialTheme.typography.bodySmall,
                        color = EcovexGreen,
                        modifier = Modifier.padding(
                            horizontal = 10.dp, vertical = 2.dp
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun TreeCardPreview(modifier: Modifier = Modifier) {
    TreeCard(
        tree = trees[1]
    )
}