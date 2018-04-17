package com.codekul.customviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MyView(context = this@MainActivity, attrs = null))
        // if you want to use myview in xml search for View in pallet :P
       // R.layout.activity_main
    }
}
