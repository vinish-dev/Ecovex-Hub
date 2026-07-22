package com.vinish.ecovexhub

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.vinish.ecovexhub.navigation.EcovexNavGraph
import com.vinish.ecovexhub.ui.components.BottomBar

@Composable
fun App(modifier: Modifier = Modifier) {
    // variable for NavGraph and Bottom Navigation,
    // Think of the NavController as the driver of your app.
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) {
        innerPadding ->

        //pass nav controller
        EcovexNavGraph(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }

}