package com.vinish.ecovexhub.navigation

sealed class Routes(val route: String) {
    data object Home: Routes("home")
    data object Updates: Routes("updates")
    data object Events: Routes("events")
    data object Explore: Routes("explore")
    data object Profile: Routes("profile")
}