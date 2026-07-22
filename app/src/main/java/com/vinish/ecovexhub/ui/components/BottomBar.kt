package com.vinish.ecovexhub.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.vinish.ecovexhub.R
import com.vinish.ecovexhub.navigation.Routes

//bottom nav items
//add new screen to bottom nav by add it to the below list

private val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route = Routes.Home.route,
        selectedIcon = R.drawable.ic_home_filled,
        unselectedIcon = R.drawable.ic_home
    ),
    BottomNavItem(
        title = "Competitions",
        route = Routes.Competitions.route,
        selectedIcon = R.drawable.ic_trophy_filled,
        unselectedIcon = R.drawable.ic_trophy
    ),
    BottomNavItem(
        title = "Events",
        route = Routes.Events.route,
        selectedIcon = R.drawable.ic_events_filled,
        unselectedIcon = R.drawable.ic_events
    ),
    BottomNavItem(
        title = "Explore",
        route = Routes.Explore.route,
        selectedIcon = R.drawable.ic_explore_filled,
        unselectedIcon = R.drawable.ic_explore
    ),
    BottomNavItem(
        title = "Profile",
        route = Routes.Profile.route,
        selectedIcon = R.drawable.ic_profile_filled,
        unselectedIcon = R.drawable.ic_profile
    )
)

//b nav bar
@Composable
fun BottomBar(
    navController: NavHostController
) {

    //get the current route from the NavController
    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    NavigationBar() {
        bottomNavItems.forEach { item ->

            //check if this item/screen is selected
            val selected = currentRoute == item.route

            //draw each item
            NavigationBarItem(
                selected = selected,

                onClick = {
                    navController.navigate(item.route) {

                        popUpTo(navController.graph.startDestinationId) { //the previous bottom tabs (Competitions, Events) are removed before navigating.
                            saveState = true //Preserves scroll position when switching tabs
                        }

                        launchSingleTop = true //Prevents duplicate destinations
                        restoreState = true    //Restores the previous state of each tab
                    }
                },

                icon = {
                    Icon(
                        painter = painterResource(if (selected) item.selectedIcon else item.unselectedIcon),
                        contentDescription = item.title
                    )
                },

                label = { Text(item.title) }
            )
        }
    }
}