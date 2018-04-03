package com.codekul.customlistadapterkotlin

import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detailed.*

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var i = intent.extras
        var bndl = Bundle()
        bndl = i
        var img = bndl.getInt("img")

        var str = bndl.getString("text")
      //  imgDetail.setImageResource(img)
        txtname.setText(str)
    }
}

/*

        var image : Bitmap = bndl.getParcelable("imgbitmap")
        imgDetail.setImageBitmap(image)
 */