package com.example.chatapp.screens

sealed class Screens (val route:String) {
    object SignUpScreen : Screens("signUpScreen")
    object LoginScreen : Screens("loginScreen")
}