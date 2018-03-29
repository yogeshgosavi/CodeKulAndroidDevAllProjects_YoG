package com.codekul.yog.interactivitycomkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        final private val RESULT_CODE = 11;
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnOk.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                val bndl = Bundle()
                bndl.putFloat("defSz", txtSize.text.toString().toFloat())
                intent.putExtras(bndl)

                // startActivity(intent)

                startActivityForResult(intent, RESULT_CODE)

            }


        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)

            when (requestCode) {
                RESULT_CODE -> if (resultCode == Activity.RESULT_OK) {
                    val bndl = data?.extras
                    txtSize.setText(bndl?.getInt("chSz", 30).toString())
                }
            }
        }
    }

