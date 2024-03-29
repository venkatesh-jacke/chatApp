package com.example.chatapp

import android.app.Application
import android.util.Log
import com.example.chatapp.notification.NotificationUtil
import com.google.firebase.messaging.FirebaseMessaging


class ChatApplication : Application() {
    private val TAG: String= ChatApplication::class.java.name
    private lateinit var notificationUtil: NotificationUtil
    override fun onCreate() {
        super.onCreate()
        FirebaseMessaging.getInstance().isAutoInitEnabled=true;
        FirebaseMessaging.getInstance().token
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val token = task.result
                    Log.d(TAG, "FCM Token: $token")
                    // Token retrieval was successful, you can save the token to your server or perform other operations.
                } else {
                    val exception = task.exception
                    if (exception != null) {
                        Log.e(TAG, "Error getting FCM token: " + exception.message)
                        // Token retrieval failed, handle the error appropriately.
                    }
                }
            }
        notificationUtil = NotificationUtil.getInstance(this)
        notificationUtil.registerNotificationChannel(
            "channelId",
            "channelName",
            "contentDescription"
        )
    }

    fun triggerNotification(
        title: String,
        content: String,
        channelId: String,
        notificationId: Int,
        targetActivity: Class<*>,
        smallIcon: Int = R.drawable.ic_notification,
        pendingIntentFlag: Int
    ) {
        notificationUtil.triggerNotification(
            title,
            content,
            channelId,
            notificationId,
            targetActivity,
            smallIcon,
            pendingIntentFlag
        )
    }

    fun cancelNotification(notificationId: Int) {
        notificationUtil.cancelNotification(notificationId)
    }

    fun updateNotification(

        channelId: String,
        notificationId: Int,
        targetActivity: Class<*>,
        pendingIntentFlag: Int
    ) {
        notificationUtil.updateNotification(
            targetActivity = targetActivity,
            channelId = channelId,
            notificationId = notificationId,
            pendingIntentFlag = pendingIntentFlag,
        )
    }
}