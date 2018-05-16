package com.codekul.sqliteroompersistentlibkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {
            val cr = car(System.currentTimeMillis(), "Android", "google")
            (application as DbApp).dbApp.CarDao().insert(cr)

            (application as DbApp).dbApp.CarDao().cars().forEach {
                Log.i("@codekul", "${it.crId}, ${it.crNm}, ${it.crOnr}")
            }
        }.start()
    }

    }
