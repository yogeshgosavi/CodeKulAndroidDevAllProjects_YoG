package com.codekul.yog.interactivitycomkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setContentView(R.layout.activity_second)
        var bndl = intent.extras
        txt.textSize = bndl.getFloat("defSz")
        skbrSize.progress = bndl.getFloat("defSz").toInt()
        skbrSize.setOnSeekBarChangeListener(
                object : SeekBar.OnSeekBarChangeListener
                {
                    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                        txt.textSize=progress.toFloat()
                    }

                    override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    }

                    override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    }
                }
        )
        btnbck.setOnClickListener {
            val backInt = Intent()
            val bndl = Bundle()
            bndl.putInt("chSz",skbrSize.progress)
            backInt.putExtras(bndl)
            setResult(Activity.RESULT_OK,backInt)
            finish()
        }
    }
}
