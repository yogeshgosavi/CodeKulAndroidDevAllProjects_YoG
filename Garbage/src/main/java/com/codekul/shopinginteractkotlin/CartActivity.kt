package com.codekul.shopinginteractkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        Log.i("OnCreate","INSIDE CART")
        var i = intent
        var bndl  = i?.extras
        Log.i("MSG",""+bndl?.get("Data"))
//        var adpt=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lst)
//        lstCart.adapter=adpt

//         i?.getSerializableExtra("shirt").toString()
      //  Log.i("OnCreate", "i" +                //  bndl?.getStringArrayList("shirt").toString()





//       val i = intent
//        i.extras
  //      totalcart.setText(al.toString())
//        val extra = intent?.extras
//       Log.i("onCreate",""+intent.extras?.get("jeans"))
//       totalcart.setText(intent.extras?.get("jeans").toString())
//val i = intent
//        val bndl = i?.extras
//        if(bndl?.get("jeans") != null){
//            totalcart.setText(bndl?.get("jeans").toString())
//            Log.i("onCreate","jeans"+bndl?.get("jeans").toString())
////                    allselected?.addAll((data?.getSerializableExtra("jeans") as? ArrayList<String>)!!)
////                    totalcart.text =allselected.toString()
//        }
//        if(bndl?.get("shirt") != null){
//            totalcart.append(bndl?.get("shirt").toString())
//            Log.i("onCreate","shirt"+bndl?.get("shirt").toString())
//
//        }
//        if(bndl?.get("jacket") != null){
//            totalcart.append(bndl?.get("jacket").toString())
//
//        }

    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        when (requestCode) {
//            11 -> if (resultCode == Activity.RESULT_OK) {
//                Log.i("onCreate", "insideOnActivityResultCART")
//                val bndl = data?.extras
//                if(bndl?.get("jeans") != null){
//                    totalcart.setText(bndl?.get("jeans").toString())
//                    Log.i("onCreate","jeans"+bndl?.get("jeans").toString())
////                    allselected?.addAll((data?.getSerializableExtra("jeans") as? ArrayList<String>)!!)
////                    totalcart.text =allselected.toString()
//                }
//                if(bndl?.get("shirt") != null){
//                    totalcart.append(bndl?.get("shirt").toString())
//                    Log.i("onCreate","shirt"+bndl?.get("shirt").toString())
//
//                }
//                if(bndl?.get("jacket") != null){
//                    totalcart.append(bndl?.get("jacket").toString())
//
//                }
//            }
//            }
  //  }
}

