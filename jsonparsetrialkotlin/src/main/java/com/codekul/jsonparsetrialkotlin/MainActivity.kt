package com.codekul.jsonparsetrialkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        useJSONparse()
    }

    private fun useJSONparse() {
        val dt = assets.open("my.json").bufferedReader().use {
            it.readText()
        }
        val rtObj = JSONObject(dt)
        Log.i("@codekul", dt)
        Log.i("@codekul", "quiz - ${rtObj.get("quiz")}")


        val inObj = rtObj.getJSONObject("quiz")

//        val invt = inObj.getString("question")
//
//        Log.i("@codekul", "question - $invt")
//
//        val list = rtObj.getJSONArray("list")
//
//        for (i in 0 until (list.length() - 1)) {
//
//            Log.i("@codekul", (list.get(i) as JSONObject).getString("age"))
//
//        }


    }

    private fun usingGson(){

        val gson = Gson()
        val mainObj = gson.fromJson(makeJSON(),myJson::class.java)
        
    }
    private fun makeJSON(): String? {
        val dt = assets.open("my.json").bufferedReader().use {
            it.readLine()
        }
        return dt

    }
}
