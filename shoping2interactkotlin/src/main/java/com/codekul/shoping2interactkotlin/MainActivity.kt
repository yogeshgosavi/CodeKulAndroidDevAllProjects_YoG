package com.codekul.shoping2interactkotlin

import android.app.ActionBar
import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
/*
https://stackoverflow.com/questions/14658469/android-intent-context-confusing
 */


class MainActivity : AppCompatActivity() {
    private val RESULT_CODE = 11
    var ar: ArrayList<String>? = null
    var data :String? =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       title ="Shopping App" //To set Activity Title
        btnJackets.setOnClickListener {
            var i = Intent(this, JacketActivity::class.java) //context Required when
            startActivityForResult(i, RESULT_CODE)

        }
        btnjeans.setOnClickListener {
            var i = Intent(this, JeansActivity::class.java)
            startActivityForResult(i, RESULT_CODE)

        }
        btnshirts.setOnClickListener {

            var i = Intent(this, ShirtActivity::class.java)

            startActivityForResult(i, RESULT_CODE)
        }
        btnCart.setOnClickListener {
            var i = Intent(this, CartActivity::class.java)
            var bndl = Bundle()
            // rather than getting data from $ar ArrayList I am using invisible text view to get data
            bndl.putString("Data", text.text.toString())
            i.putExtras(bndl)
            startActivity(i)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            RESULT_CODE -> if (resultCode == Activity.RESULT_OK) {
                val bndl = data?.extras
                if (bndl?.get("jeans") != null) {

                    text.append(bndl?.get("jeans").toString())
                    ar?.addAll((data?.getSerializableExtra("jeans") as? ArrayList<String>)!!)
                }
                if (bndl?.get("shirt") != null) {
                    text.append(bndl?.get("shirt").toString())
                    ar?.addAll((data?.getSerializableExtra("Shirt") as? ArrayList<String>)!!)

                }
                if (bndl?.get("jacket") != null) {
                    text.append(bndl?.get("jacket").toString())
                    ar?.addAll((data?.getSerializableExtra("jacket") as? ArrayList<String>)!!)
                }
            }
        }

    }
}
