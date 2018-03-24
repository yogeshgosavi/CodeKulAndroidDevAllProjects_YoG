package com.codekul.yog.loginkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn.setOnClickListener {
            var id = editText.text.toString()
            var pass = editText2.text.toString()
            if(id == pass)
                disres.setText("SUCESS")
            else
                disres.setText("WRONG INPUT!!!")
        }
    }
}
