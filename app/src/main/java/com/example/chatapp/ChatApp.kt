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
import com.example.chatapp.notification.NotificationUtil

@Composable
fun ChatApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
//        val navController = rememberNavController()
//        NavGraph(navController)
//        val context = LocalContext.current
//        val i= Intent(context,NotificationActivity::class.java)
//        val pi= PendingIntent.getActivity(context,0, i,PendingIntent.FLAG_IMMUTABLE)
//        val notificationUtil=NotificationUtil(context)
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            Button(onClick = { NotificationUtil(context = context).startNotification(title="Hello","world", pendingIntent = pi) }) {
//                Text(text = "Trigger")
//
//            }
//            Button(onClick = {  notificationUtil.updateNotification(notificationId = 0, pendingIntent = pi ) }) {
//                Text(text = "Update")
//
//            }
//            Button(onClick = { notificationUtil.cancelNotification(0)}) {
//                Text(text = "Cancel")
//
//            }
//        }
    }
}