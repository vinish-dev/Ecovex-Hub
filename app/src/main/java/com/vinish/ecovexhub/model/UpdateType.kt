package com.vinish.ecovexhub.model

import androidx.compose.ui.graphics.Color
import com.vinish.ecovexhub.R

enum class UpdateType(val bg: Color, val tint: Color, val icon: Int ) {

    ANNOUNCEMENT(Color(0xFFE8F5E9), Color(0xFF2E7D32), R.drawable.campaign),

    REMINDER(Color(0xFFE3F2FD), Color(0xFF1565C0), R.drawable.ic_notification),

    WINNER(Color(0xFFFFF8E1), Color(0xFFF57F17), R.drawable.ic_trophy_filled),

    DEADLINE(Color(0xFFFFEBEE), Color(0xFFC62828), R.drawable.ic_update_clcok)
}