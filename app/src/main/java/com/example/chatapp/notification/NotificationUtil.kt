package com.example.chatapp.notification

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.chatapp.R

class NotificationUtil {

    private  var context: Context
    private  var notificationManager: NotificationManager
    private  var notificationManagerCompat: NotificationManagerCompat
    private var instance:NotificationUtil?=null

    constructor(context: Context) {
        this.context = context
        this.notificationManager =
            context.getSystemService(AppCompatActivity.NOTIFICATION_SERVICE) as NotificationManager
        this.notificationManagerCompat = NotificationManagerCompat.from(context)
    }


    companion object {
        @Volatile
        private var instance: NotificationUtil? = null
        fun getInstance(context: Context): NotificationUtil {
            return instance ?: synchronized(this) {
                instance ?: NotificationUtil(context.applicationContext).also { instance = it }
            }
        }
    }



    fun registerNotificationChannel(
        channelId: String?,
        channelName: String?,
        contentDescription: String?
    ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                channelName,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                enableLights(true)
                description = contentDescription
                setShowBadge(true)
            }
            notificationManager.createNotificationChannel(channel)
        }

    }

    @SuppressLint("MissingPermission")
    fun triggerNotification(
        title: String,
        content: String,
        channelId: String,
        notificationId: Int,
        targetActivity: Class<*>,
        smallIcon: Int = R.drawable.ic_notification,
        pendingIntentFlag: Int
    ) {
        val intent = Intent(context, targetActivity)
        val pi = PendingIntent.getActivity(context, 0, intent, pendingIntentFlag)
        val notification = NotificationCompat.Builder(context, channelId)
            .setContentTitle(title)
            .setContentText(content)
            .setSmallIcon(smallIcon)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pi)
            .build()
        val notificationManagerCompat = NotificationManagerCompat.from(context)
        notificationManagerCompat.notify(notificationId, notification)
    }

    fun cancelNotification(notificationId: Int) {
        val notificationManagerCompat = NotificationManagerCompat.from(context)
        notificationManagerCompat.cancel(notificationId)
    }

    @SuppressLint("MissingPermission")
    fun updateNotification(
        targetActivity: Class<*>,
        channelId: String,
        pendingIntentFlag: Int,
        notificationId: Int

    ) {
        val intent = Intent(context, targetActivity)
        val pi = PendingIntent.getActivity(context, 0, intent, pendingIntentFlag)
        val notification = NotificationCompat.Builder(context, channelId)
            .setContentTitle("Venkat")
            .setContentText("Jacke")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setStyle(
                NotificationCompat.BigPictureStyle()
                    .bigPicture(BitmapFactory.decodeResource(context.resources, R.drawable.android))
            )
            .setContentIntent(pi)
            .build()

        val notificationManagerCompat = NotificationManagerCompat.from(context)
        notificationManagerCompat.notify(notificationId, notification)
    }
}
