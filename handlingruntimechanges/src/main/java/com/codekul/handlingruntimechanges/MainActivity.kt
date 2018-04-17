package com.codekul.handlingruntimechanges

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        when {
            newConfig?.orientation == Configuration.ORIENTATION_LANDSCAPE -> {
            img.setImageResource(R.drawable.ic_landscape)
            }
            newConfig?.orientation == Configuration.ORIENTATION_PORTRAIT -> {
                img.setImageResource(R.drawable.ic_portrait)


            }
            else -> {
                img.setImageResource(R.drawable.ic_all)

            }
        }
    }

}
