package com.example.chatapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.chatapp.ui.theme.ChatAppTheme

class NotificationActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ChatAppTheme {
                Box(
                    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center

                ) {
                    Text(text = "Notification Activity")
                }

            }
        }
    }


}