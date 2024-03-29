package com.example.chatapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.chatapp.ChatApp
import com.example.chatapp.utils.splashScreen
import com.example.chatapp.viewModels.MainViewModel

class WelcomeActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                ChatApp()

        }
    }


}