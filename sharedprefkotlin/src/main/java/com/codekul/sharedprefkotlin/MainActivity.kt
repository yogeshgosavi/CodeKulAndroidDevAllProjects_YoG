package com.codekul.sharedprefkotlin

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs = getSharedPreferences("myPrefs", Context.MODE_PRIVATE)
        store(prefs)
        retrieve(prefs)

    }
    fun store(prefs : SharedPreferences){
      val editor =   prefs.edit()
        editor.putString("keyString","HELLO THIS IS MY SAMPLE SHARED PREF DATA")
        editor.putInt("keyInt",123)
        editor.commit()
         // use appply when you want it asynchronous use commit for synchronous

    }


    fun retrieve(prefs : SharedPreferences){
        val str = prefs.getString("keyString","not available")
        val intgr = prefs.getInt("keyInt",0)

        Log.i("@Codekul", "keyString : $str")
    }
}

