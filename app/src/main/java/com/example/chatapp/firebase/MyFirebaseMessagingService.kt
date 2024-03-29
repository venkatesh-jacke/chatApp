package com.example.chatapp.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService:FirebaseMessagingService() {
    private var TAG:String=MyFirebaseMessagingService::class.java.name
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(TAG, "FCM New Token: $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.d(TAG, "Message Recieved: $message")
    }
}