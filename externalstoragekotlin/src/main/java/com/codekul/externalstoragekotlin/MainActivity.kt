package com.codekul.externalstoragekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("@codekul","External Storage path : ${getExternalFilesDir("")}")
        Log.i("@codekul","External Storage path : ${getExternalFilesDir("")}")

        writeToStorage()
        readToStorage()

    }
    fun writeToStorage(){
        if(Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED){

            val fl = File(
                    Environment.getExternalStoragePublicDirectory(""),"my.txt"
            )
            fl.createNewFile()
            FileOutputStream(fl).use {
                it.write("WELCOME TO CODEKUL".toByteArray())
            }

        }
        else{
            Toast.makeText(this@MainActivity,"Storage not found",Toast.LENGTH_LONG).show()
        }
    }

    fun readToStorage(){
        if(Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED){
            val fl = File(
                    Environment.getExternalStoragePublicDirectory(""),"my.txt"
            )
            var dt = FileInputStream(fl).bufferedReader().use {
                it.readLine()
            }
            Log.i("#@Codekul","data written is $dt")
        }else{
            Toast.makeText(this@MainActivity ,"Storage not found",Toast.LENGTH_LONG).show()
        }

    }
}
