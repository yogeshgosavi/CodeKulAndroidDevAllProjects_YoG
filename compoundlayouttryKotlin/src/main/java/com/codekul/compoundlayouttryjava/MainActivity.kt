package com.codekul.compoundlayouttryjava

import android.content.Context
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShow.setOnClickListener {
            var vw :View = layoutInflater.inflate(
                    R.layout.compound_layer,
                    null,
                    false
            )
            vw.findViewById<ImageView>(R.id.img).setOnClickListener {
                (it as ImageView).setImageResource( R.drawable.ic_error_black_24dp)
            }
layoutroot.addView(vw)
        }
    }
}
