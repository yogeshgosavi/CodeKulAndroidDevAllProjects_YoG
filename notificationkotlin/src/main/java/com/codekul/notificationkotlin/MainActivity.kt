package com.codekul.notificationkotlin

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShow.setOnClickListener{
        showNotification()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun showNotification(){
        val mngr = getSystemService(Context.NOTIFICATION_SERVICE ) as NotificationManager
        val ntfn =
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    Notification.Builder(this,"123")
                           .setTicker("THIS IS SAMPLE NOTIFICATION")
                           .setContentTitle("TITLLE")
                           .setContentText("This is Sample Notification")
                           .setSmallIcon(R.mipmap.ic_launcher_round)
                           .setWhen(System.currentTimeMillis())
                           .setDefaults(Notification.DEFAULT_ALL)
                           .setContentIntent(PendingIntent.getActivity(this,
                                   123,
                                   Intent(MainActivity@this,SecondActivity::class.java),
                                   PendingIntent.FLAG_UPDATE_CURRENT))
                           .build()

    }else{
             Notification.Builder(this)
                    .setTicker("THIS IS SAMPLE NOTIFICATION")
//                    .setContentTitle("TITLLE")
//                    .setContentText("This is Sample Notification")
                    .setSmallIcon(R.mipmap.ic_launcher_round)
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setContentIntent(PendingIntent.getActivity(this,
                            123,
                            Intent(MainActivity@this,SecondActivity::class.java),
                            PendingIntent.FLAG_UPDATE_CURRENT))
                            .build()

        }
        mngr.notify(123,ntfn)


    }
}
