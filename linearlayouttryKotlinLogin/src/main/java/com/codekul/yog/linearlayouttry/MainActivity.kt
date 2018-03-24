package com.codekul.yog.linearlayouttry

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            var id = username.text.toString()
            Log.i("USERNAME", id)
            var pass = pass.text.toString()
            Log.i("pass" , pass)
            if(id == pass)
                res.setText("SUCESS")
            else
                res.setText("WRONG INPUT!!!")
        }

        created.setOnClickListener {
            setContentView(R.layout.activity_create)
        }
    }
}
