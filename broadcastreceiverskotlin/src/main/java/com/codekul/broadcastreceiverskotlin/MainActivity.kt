package com.codekul.broadcastreceiverskotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val broadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
Log.i("@codekul","onBroadcastReceiver")
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOk.setOnClickListener {
            sendBroadcast(
                    Intent("com.codekul.my.ACTION")
            )
        }

    }

    override fun onStart() {
        registerReceiver(broadcastReceiver, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
        super.onStart()
    }

    override fun onStop() {
        unregisterReceiver(broadcastReceiver)
        super.onStop()
    }
}


