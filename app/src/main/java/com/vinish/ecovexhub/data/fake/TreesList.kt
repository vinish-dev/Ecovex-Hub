package com.vinish.ecovexhub.data.fake

import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.model.Tree

val trees = listOf<Tree>(
    Tree(
        name = "Banyan Tree",
        scientificName = "Ficus benghalensis",
        location = "Near Main Block",
        age = "45+ yrs",
        imageRes = R.drawable.tree_banyan
    ),
    Tree(
        name = "Pink Tabebuia",
        scientificName = "Tabebuia rosea",
        location = "Central Avenue",
        age = "12 yrs",
        imageRes = R.drawable.tree_pinktabebuia
    ),
    Tree(
        name = "Coconut Palm",
        scientificName = "Cocos nucifera",
        location = "Hostel Road",
        age = "20+ yrs",
        imageRes = R.drawable.tree_coconut
    ),
    Tree(
        name = "Golden Shower",
        scientificName = "Cassia fistula",
        location = "Science Block",
        age = "15 yrs",
        imageRes = R.drawable.tree_goldenshower
    )
)
