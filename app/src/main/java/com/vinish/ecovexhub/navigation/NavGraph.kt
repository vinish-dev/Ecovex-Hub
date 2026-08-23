package com.vinish.ecovexhub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vinish.ecovexhub.data.fake.eventList
import com.vinish.ecovexhub.ui.eventdetails.EventsDetailsScreen
import com.vinish.ecovexhub.ui.updates.UpdatesScreen
import com.vinish.ecovexhub.ui.events.EventsScreen
import com.vinish.ecovexhub.ui.explore.ExploreScreen
import com.vinish.ecovexhub.ui.home.HomeScreen
import com.vinish.ecovexhub.ui.profile.ProfileScreen

@Composable
fun EcovexNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    // variable

    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {
        //calls for each screen
        composable(Routes.Home.route) {
            HomeScreen(
                modifier = modifier,
                onEventClick = { event -> navController.navigate("event/${event.id}")}
            )
        }

        composable(Routes.Updates.route) {
            UpdatesScreen(
                modifier = modifier
            )
        }

        composable(Routes.Events.route) {
            EventsScreen(
                modifier = modifier,
                onEventClick = { event ->
                    navController.navigate("event/${event.id}")
                }
            )
        }

        composable(Routes.Explore.route) {
            ExploreScreen(
                modifier = modifier
            )
        }

        composable(Routes.Profile.route) {
            ProfileScreen()
        }

        //register the path event/id
        composable("event/{eventId}") { backStackEntry ->

            //get the id from arguments of current backstack(event details screen)
            val eventId = backStackEntry.arguments
                ?.getString("eventId")
                ?.toIntOrNull()

            // use the id to get the clicked event from list
            val event = eventList.find { it.id == eventId }

            if (event != null) {
                EventsDetailsScreen(
                    event = event,
                    onBackClick = { navController.popBackStack() }
                )
            }

        }
    }
}