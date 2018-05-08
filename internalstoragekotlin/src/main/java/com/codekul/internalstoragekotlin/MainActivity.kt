package com.codekul.internalstoragekotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codekul.internalstoragekotlin.R.id.txt
class MainActivity : AppCompatActivity() {


    //    #notepad google keep ^_^save/list/edit/new note creations / list of notes
//    #fileExplorer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("@Codekul","Internal path = $filesDir")
      //  txt.text = filesDir.toString()
        Log.i("@Codekul","cache path = $cacheDir")
      //  txt.append(cacheDir.toString())

        store()
        retrieve()
        filesDir.list().forEach {
            Log.i("@codekul","file is $it")
        }
        filesDir.parentFile.list().forEach {
            Log.i("@codekul","file is $it")
        }


    }

    fun store(){
        openFileOutput("my.txt", Context.MODE_PRIVATE).use {
            it.write("HELLO THIS IS SAMPLE BYTEARRAY".toByteArray())
        }
    }

    fun retrieve() {
        val isp = openFileInput("my.txt")
        val dt = isp.bufferedReader().use {
            it.readLine()
        }
        Log.i("@Codekul", "data Stored in My.txt is $dt")
    }
}
