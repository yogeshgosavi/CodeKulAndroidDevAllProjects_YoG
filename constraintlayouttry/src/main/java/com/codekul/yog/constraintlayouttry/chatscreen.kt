package com.codekul.yog.constraintlayouttry

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class chatscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatscreen)
        val actionBar = supportActionBar // or getActionBar();
        // set the top title
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false)
        };

    }

}
