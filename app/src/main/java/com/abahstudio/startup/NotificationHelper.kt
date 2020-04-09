package com.abahstudio.startup

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.ContextWrapper
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.StringBuilder

@RequiresApi(Build.VERSION_CODES.O)
class NotificationHelper(conext:Context):ContextWrapper(conext){

    val manager:NotificationManager by lazy{
        getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun Notify1(title:String, body:String):Notification.Builder{
        return Notification.Builder(applicationContext, FIRST_CHANNEL)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.bullbasaur)
            .setAutoCancel(true)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun Notify2(title:String, body:String):Notification.Builder{
        return Notification.Builder(applicationContext, SECOND_CHANNEL)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.bullbasaur)
            .setAutoCancel(true)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun Notify3(title:String, body:String):Notification.Builder{
        return Notification.Builder(applicationContext, THIRD_CHANNEL)
            .setContentText(body)
            .setContentTitle(title)
            .setSmallIcon(R.drawable.bullbasaur)
            .setAutoCancel(true)
    }

    fun Notify(id:Int, notification:Notification.Builder){
        manager.notify(id, notification.build())
    }

    init {

        //First Channel
        val chan1 =NotificationChannel(FIRST_CHANNEL, "First channel", NotificationManager.IMPORTANCE_DEFAULT)
        chan1.lightColor= Color.GREEN
        chan1.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan1)

        //Second Channel
        val chan2 =NotificationChannel(SECOND_CHANNEL, "Second channel", NotificationManager.IMPORTANCE_DEFAULT)
        chan2.lightColor= Color.GREEN
        chan2.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan2)

        //First Channel
        val chan3 =NotificationChannel(THIRD_CHANNEL, "Third channel", NotificationManager.IMPORTANCE_DEFAULT)
        chan3.lightColor= Color.GREEN
        chan3.lockscreenVisibility=Notification.VISIBILITY_PRIVATE
        manager.createNotificationChannel(chan3)
    }

    companion object{
        val FIRST_CHANNEL="first"
        val SECOND_CHANNEL="second"
        val THIRD_CHANNEL="third"
    }

}