package com.codekul.intentfilterskotlin

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNews.setOnClickListener {
basicConcept()
        }
        btnBrowse.setOnClickListener {
            anything()
        }
        btnDial.setOnClickListener {
            dialer()
        }
        btncall.setOnClickListener {
            call()
        }
    }

    fun basicConcept(){
        val intent = Intent()
        intent.action = "com.codekul.intentfilterskotlin.NEWS"
        //intent.categories.add("com.codekul.intentfilterskotlin.category.CRICKET")
        // intent.addCategory("com.codekul.intentfilterskotlin.category.CRICKET")
        intent.data = Uri.parse("http://codekul.com")
        startActivity(intent)
    }


    fun call(){
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("tel://9767292062")
        startActivity(intent)
    }
    fun dialer() =  startActivity(Intent(Intent.ACTION_DIAL))
    fun anything(){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("http://codekul.com")
        startActivity(intent)

    }
}
