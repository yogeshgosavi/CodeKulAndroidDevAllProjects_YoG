package com.codekul.assets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val asset1 = assets.open("Bouncy.mp3")

        val resourcename = R.drawable.abc_ab_share_pack_mtrl_alpha
        val strings = resources.getString(R.string.app_name)
        val dim = resources.getDimension(R.dimen.size)

    }
}
