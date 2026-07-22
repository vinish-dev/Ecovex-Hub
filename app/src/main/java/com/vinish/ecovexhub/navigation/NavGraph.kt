package com.vinish.ecovexhub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vinish.ecovexhub.ui.competitons.CompetitionScreen
import com.vinish.ecovexhub.ui.events.EventsScreen
import com.vinish.ecovexhub.ui.explore.ExploreScreen
import com.vinish.ecovexhub.ui.home.HomeScreen
import com.vinish.ecovexhub.ui.profile.ProfileScreen

@Composable
fun EcovexNavGraph(navController: NavHostController){
    // variable

    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ){
        //calls for each screen
        composable(Routes.Home.route){
            HomeScreen()
        }

        composable(Routes.Competitions.route){
            CompetitionScreen()
        }

        composable(Routes.Events.route){
            EventsScreen()
        }

        composable(Routes.Explore.route){
            ExploreScreen()
        }

        composable(Routes.Profile.route){
            ProfileScreen()
        }
    }
}