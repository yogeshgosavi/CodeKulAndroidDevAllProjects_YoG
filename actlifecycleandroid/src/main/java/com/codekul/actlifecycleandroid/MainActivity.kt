package com.codekul.actlifecycleandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // et.text = savedInstanceState?.getString("date")
        btnok.setOnClickListener {
            et.text = System.currentTimeMillis().toString()
        }
        mt("onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putString("date",et.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        et.text = savedInstanceState?.getString("date")
    }

    override fun onStart() {
        super.onStart()
        mt("onStart")
    }

    override fun onResume() {
        super.onResume()
        mt("onResume")
    }

    override fun onPause() {
        super.onPause()
        mt("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        mt("onRestart")
    }

    override fun onStop() {
        super.onStop()
        mt("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        mt("onDestroy")
    }
   //function to make toast you can use it many times without declearing it each time if you use like this
    private fun mt(msg : String) = Toast.makeText(this@MainActivity , msg ,Toast.LENGTH_LONG)
}
