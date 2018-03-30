package com.codekul.shoping2interactkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        var i = intent.extras
        var bndl = Bundle()
        bndl = i
        var alldata :String
        alldata = bndl?.getString("Data").toString()
      alldata = alldata.replace("[", "\n").replace("]","").replace(",","\n")
        totalcart.text = alldata
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}