package com.example.chatapp.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.chatapp.screens.ForgotScreen
import com.example.chatapp.screens.LoginScreen
import com.example.chatapp.screens.Screens
import com.example.chatapp.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(navController: NavController) {

    navigation(startDestination = Screens.LoginScreen.route, route = Routes.AuthRoute.route){
        composable(route=Screens.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(route=Screens.ForgotScreen.route){
            ForgotScreen(navController = navController)
        }
        composable(route=Screens.SignUpScreen.route){
            SignUpScreen(navController = navController)
        }
    }

}

