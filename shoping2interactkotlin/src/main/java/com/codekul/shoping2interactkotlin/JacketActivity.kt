package com.codekul.shoping2interactkotlin

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_jacket.*

class JacketActivity : AppCompatActivity() {
    val Jacket = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jacket)
        drj.setOnClickListener {
            drj.setBackgroundColor(Color.parseColor("#4a0072"))
            drj.setTextColor(Color.parseColor("#FFFFFFFF"))
            Jacket.add(drj.text.toString())
        }
        bfj.setOnClickListener {
            bfj.setBackgroundColor(Color.parseColor("#4a0072"))
            bfj.setTextColor(Color.parseColor("#FFFFFFFF"))
            Jacket.add(bfj.text.toString())
        }
        mrj.setOnClickListener {
            mrj .setBackgroundColor(Color.parseColor("#4a0072"))
            mrj.setTextColor(Color.parseColor("#FFFFFFFF"))
            Jacket.add(mrj.text.toString())
        }
        vj.setOnClickListener {
            vj.setBackgroundColor(Color.parseColor("#4a0072"))
            vj.setTextColor(Color.parseColor("#FFFFFFFF"))
            Jacket.add(vj.text.toString())
        }

        btnbackJacket.setOnClickListener {
            val i = Intent()
            i.putExtra("jacket",Jacket)
            setResult( Activity.RESULT_OK, i)
            finish()
        }
    }
}
