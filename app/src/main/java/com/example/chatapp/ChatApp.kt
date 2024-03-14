package com.example.chatapp

import android.app.PendingIntent
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.example.chatapp.activities.NotificationActivity
import com.example.chatapp.navigation.NavGraph


@Composable
fun ChatApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val navController = rememberNavController()
        NavGraph(navController)
        val context = LocalContext.current
        val chatApplication = context.applicationContext as ChatApplication
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(onClick = {
                chatApplication.triggerNotification(
                    "Notification Title",
                    "Notification Content",
                    "channelId",
                    0, // Notification ID
                    NotificationActivity::class.java,
                    R.drawable.ic_notification,
                    PendingIntent.FLAG_MUTABLE
                )
            }) {
                Text(text = "Trigger")

            }
            Button(onClick = {
                chatApplication.updateNotification(
                    channelId ="channelId",
                    notificationId = 0,
                    targetActivity = NotificationActivity::class.java,
                    pendingIntentFlag= PendingIntent.FLAG_IMMUTABLE
                )
            }) {
                Text(text = "Update")

            }
            Button(onClick = { chatApplication.cancelNotification(0)}) {
                Text(text = "Cancel")

            }
        }
    }
}