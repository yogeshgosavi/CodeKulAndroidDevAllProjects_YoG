package com.codekul.shoping2interactkotlin

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shirt.*

class ShirtActivity : AppCompatActivity() {
    val Shirt = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirt)

        stTshirt.setOnClickListener {
            stTshirt.setOnClickListener {
                stTshirt.setBackgroundColor(Color.parseColor("#4a0072"))
                stTshirt.setTextColor(Color.parseColor("#FFFFFFFF"))
                Shirt.add(stTshirt.text.toString())
            }
        }
        stTuxeto.setOnClickListener {
            stTuxeto.setOnClickListener {
                stTuxeto.setBackgroundColor(Color.parseColor("#4a0072"))
                stTuxeto.setTextColor(Color.parseColor("#FFFFFFFF"))
                Shirt.add(stTuxeto.text.toString())
            }
        }
        stPolo.setOnClickListener {
            stPolo.setOnClickListener {
                stPolo.setBackgroundColor(Color.parseColor("#4a0072"))
                stPolo.setTextColor(Color.parseColor("#FFFFFFFF"))
                Shirt.add(stPolo.text.toString())
            }
        }
        stjersey.setOnClickListener {
            stjersey.setOnClickListener {
                stjersey.setBackgroundColor(Color.parseColor("#4a0072"))
                stjersey.setTextColor(Color.parseColor("#FFFFFFFF"))
                Shirt.add(stjersey.text.toString())
            }

        }

        btnbackShirt.setOnClickListener {
            val i = Intent()
            i.putExtra("shirt",Shirt)
            setResult( Activity.RESULT_OK, i)
            finish()
        }
    }
}

