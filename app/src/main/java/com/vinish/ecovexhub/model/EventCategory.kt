package com.vinish.ecovexhub.model

import androidx.annotation.DrawableRes
import com.vinish.ecovexhub.R

enum class EventCategory(
    val displayName: String,
    @DrawableRes bannerRes: Int
) {
    CHALLENGE("Challenge", R.drawable.event_competition),
    WORKSHOP("Workshop", R.drawable.event_talks),
    TALK("Talk", R.drawable.event_talks),
    DRIVE("Drive", R.drawable.event_drive),
    CREATIVE("Creative",R.drawable.event_creative )
}
