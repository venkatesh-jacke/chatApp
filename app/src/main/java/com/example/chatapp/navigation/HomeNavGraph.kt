package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.chatapp.screens.HomeScreen
import com.example.chatapp.screens.LoginScreen
import com.example.chatapp.screens.Screens
import com.example.chatapp.screens.SettingScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController){


    navigation(startDestination = Screens.HomeScreen.route, route = Screens.HomeRoute.route){
        composable(route=Screens.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(route=Screens.SettingScreen.route){
            SettingScreen(navController = navController)
        }

    }
}