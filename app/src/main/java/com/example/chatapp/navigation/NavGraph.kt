package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.chatapp.screens.Screens
import com.example.chatapp.screens.SignUpScreen



@Composable
fun NavGraph() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Screens.AuthRoute.route){

        authNavGraph(navController)
        homeNavGraph(navController)
    }
}
