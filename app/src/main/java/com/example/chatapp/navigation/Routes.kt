package com.example.chatapp.navigation

sealed class Routes(val route:String){
    object AuthRoute:Routes("AuthRoute")
    object HomeRoute:Routes("HomeRoute")
}