package com.example.chatapp

import android.app.Application
import com.example.chatapp.notification.NotificationUtil

class ChatApplication : Application() {

    private lateinit var notificationUtil: NotificationUtil
    override fun onCreate() {
        super.onCreate()
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