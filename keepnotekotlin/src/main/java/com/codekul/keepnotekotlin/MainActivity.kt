package com.codekul.keepnotekotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncreateNote.setOnClickListener {
            var file_name = titleOfNote.text.toString()
            var file_details = dataofNote.text.toString()
            saveNote(file_name,file_details)
            Log.i("@Codekul","data send filename = $file_name \n data = $file_details")
            retrieve(file_name)
        }
        btnshowNote.setOnClickListener {
          //  retrieve("myname")
            filesDir.list().forEach {
                Log.i("@codekul","$it")
            }
        }

       btncheck.setOnClickListener {
           delete("hey")
       }

    }

    fun saveNote(filename:String, filedetails:String){
        openFileOutput("$filename.txt", Context.MODE_PRIVATE).use {
            it.write(filedetails.toByteArray())
        }
    }


    fun retrieve(filename: String) {
        val isp = openFileInput("$filename.txt")
        val dt = isp.bufferedReader().use {
            it.readLine()
        }
        Toast.makeText(this,"$filename : $dt",Toast.LENGTH_LONG).show()
        Log.i("@Codekul", "data Stored in $filename.txt is $dt")
    }

    fun edit(filename: String,filedetails: String) {
        val isp = openFileInput("$filename.txt")
        val dt = isp.bufferedReader().use {
            it.readLine()
        }
        openFileOutput("$filename.txt", Context.MODE_PRIVATE).use {
            it.write(filedetails.toByteArray())
        }
    }

    fun delete(filename: String){
        var file = File("$filesDir/$filename.txt")
        file.delete()
    }
}
