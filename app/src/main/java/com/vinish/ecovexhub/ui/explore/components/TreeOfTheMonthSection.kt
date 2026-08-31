package com.vinish.ecovexhub.ui.explore.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vinish.ecovexhub.data.fake.treeOfTheMonth
import com.vinish.ecovexhub.model.TreeOfTheMonth
import com.vinish.ecovexhub.ui.components.SectionHeader

@Composable
fun TreeOfTheMonthSection(
    tree: TreeOfTheMonth,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        SectionHeader(
            title = "Tree of The Month"
        )

        TreeOfTheMonthCard(treeOfTheMonth = tree)
    }
}