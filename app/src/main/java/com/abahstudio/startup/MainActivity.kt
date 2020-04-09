package com.abahstudio.startup

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var notificationHelper:NotificationHelper?= null
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationHelper = NotificationHelper(this)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun ch1Click(view: View) {
        notificationHelper!!.Notify(1,
            notificationHelper!!.Notify1("First",etMessage.text.toString()))
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun ch2Click(view: View) {
        notificationHelper!!.Notify(2,
            notificationHelper!!.Notify2("Second",etMessage.text.toString()))
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun ch3Click(view: View) {
        notificationHelper!!.Notify(3,
            notificationHelper!!.Notify3("Third",etMessage.text.toString()))
    }
}
