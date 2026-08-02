package com.vinish.ecovexhub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vinish.ecovexhub.ui.updates.UpdatesScreen
import com.vinish.ecovexhub.ui.events.EventsScreen
import com.vinish.ecovexhub.ui.explore.ExploreScreen
import com.vinish.ecovexhub.ui.home.HomeScreen
import com.vinish.ecovexhub.ui.profile.ProfileScreen

@Composable
fun EcovexNavGraph(navController: NavHostController, modifier: Modifier = Modifier){
    // variable

    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ){
        //calls for each screen
        composable(Routes.Home.route){
            HomeScreen(modifier = modifier)
        }

        composable(Routes.Updates.route){
            UpdatesScreen()
        }

        composable(Routes.Events.route){
            EventsScreen(modifier = modifier)
        }

        composable(Routes.Explore.route){
            ExploreScreen()
        }

        composable(Routes.Profile.route){
            ProfileScreen()
        }
    }
}