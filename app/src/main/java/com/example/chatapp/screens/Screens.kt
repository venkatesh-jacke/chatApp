package com.example.chatapp.screens

sealed class Screens (val route:String) {


    object LoginScreen : Screens("LoginScreen")
    object SignUpScreen : Screens("SignUpScreen")
    object ForgotScreen : Screens("ForgotScreen")
    object HomeScreen : Screens("HomeScreen")
    object SettingScreen : Screens("SettingScreen")

    object AuthRoute:Screens("AuthRoute")
    object HomeRoute:Screens("HomeRoute")
}