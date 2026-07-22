package com.vinish.ecovexhub

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.vinish.ecovexhub.navigation.EcovexNavGraph

@Composable
fun App(modifier: Modifier = Modifier) {
    // variable for NavGraph and Bottom Navigation,
    // Think of the NavController as the driver of your app.
    val navController = rememberNavController()

    EcovexNavGraph(navController =  navController)
}