package com.codekul.servicesmedia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      var i = Intent(this,MyService::class.java)
        btnplay.setOnClickListener {
            startService(i)
        }
        btnStop.setOnClickListener {
            stopService(i)

        }
    }
}
