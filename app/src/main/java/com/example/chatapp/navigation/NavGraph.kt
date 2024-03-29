package com.example.chatapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.chatapp.screens.Screens
import com.example.chatapp.screens.SignUpScreen


@Composable
fun NavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screens.SignUpScreen.route){
        composable(route = Screens.SignUpScreen.route){
            SignUpScreen()
        }
        composable(route = Screens.LoginScreen.route){
            SignUpScreen()
        }

    }
}