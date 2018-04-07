package com.codekul.dynamicuicreationkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //dynamic UI creation
        val lv_main = findViewById<LinearLayout>(R.id.linearlayoutmain)
        val etView = EditText(this)
        etView.textSize = 20f
        etView.hint = "Any Word to Convert into Capital Case"
        lv_main.addView(etView)

        val btnok = Button(this)
        btnok.textSize = 10f
        btnok.text = " CONVERT TO UPPER CASE"
        btnok.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT ,LinearLayout.LayoutParams.WRAP_CONTENT  )
        lv_main.addView(btnok)
        btnok.setOnClickListener {
           var Str : String =  etView.text.toString().toUpperCase()
            etView.setText(Str)
        }
    }
}
