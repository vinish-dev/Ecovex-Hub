package com.vinish.ecovexhub.navigation

sealed class Routes(val route: String) {
    data object Home: Routes("home")
    data object Competitions: Routes("competitions")
    data object Events: Routes("events")
    data object Explore: Routes("explore")
    data object Profile: Routes("profile")
}