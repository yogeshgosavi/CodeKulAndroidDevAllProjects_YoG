package com.codekul.shopinginteractkotlin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val RESULT_CODE = 11
    var seJeans = ArrayList<String>()
    var seShirts = ArrayList<String>()
    var seJacket = ArrayList<String>()

     var ar : ArrayList<String>? = null
     var ar1 : ArrayList<String>? = null
     var ar2 : ArrayList<String>? = null


    var bnlCpy = Bundle()
   // var Intention = Intent(this@MainActivity,CartActivity::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("onCreate", "MainAcitivtyOnCreate")


        btnJackets.setOnClickListener {
            var i = Intent(this, JacketsActivity::class.java)
            startActivityForResult(i, RESULT_CODE)
            Log.i("onCreate", "btnJacket")

        }
        btnjeans.setOnClickListener {
            var i = Intent(this, JeansActivity::class.java)
            startActivityForResult(i, RESULT_CODE)
            Log.i("onCreate", "btnJeans")

        }
        btnshirts.setOnClickListener {

            var i = Intent(this, ShirtsActivity::class.java)

            startActivityForResult(i, RESULT_CODE)
            Log.i("onCreate", "btnShirts")
        }

            btnCart.setOnClickListener {
                var joined : ArrayList<String>? = null
                joined?.add(ar.toString())
                joined?.add(ar1.toString())
                joined?.add(ar2.toString())

                Log.i("MSG",""+joined.toString())


    var Intention = Intent(this,CartActivity::class.java)
                var bndl = Bundle ()
                bndl?.putStringArrayList("jeans",ar)
                bndl?.putStringArrayList("shirt",ar1)
                bndl?.putStringArrayList("jacket",ar2)
                Log.i("msg", ar1.toString())
            Intention?.putExtras(bndl)
//              Intention.putExtra("jeans",ar)
//                Intention.putExtra("shirt",ar1)
//                Intention.putExtra("jacket",ar2)

                startActivity(Intention)

            }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.i("onCreate", "onActivityResult")
        Log.i("onCreate", "requestCode : $requestCode resultCode : $resultCode data : $data")

        when (requestCode) {
            RESULT_CODE -> if (resultCode == Activity.RESULT_OK) {
                Log.i("onCreate", "insideOnActivityResult")
                val bndl = data?.extras
                if(bndl?.get("jeans") != null){
                    text.setText(bndl?.get("jeans").toString())
//                    var ar:ArrayList<kotlin.String>?
                    ar?.addAll((data?.getSerializableExtra("jeans") as? ArrayList<String>)!!)
                    // ar = data?.getSerializableExtra("jeans") as? ArrayList<String>
                  //
               //     Intention?.putExtra("jeans",bndl?.get("jeans").toString())

                }
                if(bndl?.get("shirt") != null){
                    text.setText(bndl?.get("shirt").toString())
                    ar1?.addAll((data?.getSerializableExtra("Shirt") as? ArrayList<String>)!!)

                    //      Intention?.putExtra("shirt",bndl?.get("shirt").toString())


                }
                if(bndl?.get("jacket") != null){
                    text.setText(bndl?.get("jacket").toString())
                    ar2?.addAll((data?.getSerializableExtra("jacket") as? ArrayList<String>)!!)
                    //  ar = data?.getSerializableExtra("jacket") as? ArrayList<String>
                    //            Intention?.putExtra("jacket",bndl?.get("jacket").toString())

                }

//                Log.i("DATA",""+ (ar?.get(0) ?:"jeans" ))
                Log.i("onCreate",
                        "jeans"+bndl?.get("jeans")
                                +"jacket"+bndl?.get("jacket")
                                +"Shirt"+bndl?.get("shirt"))
                bnlCpy= data?.extras!!
                Log.i("Bundle" , "data" + bnlCpy)
            }



        /*
        Don't look at commented code :P
         */
        // if(requestCode== Activity.RESULT_OK){
        //  var mylist = intent?.getSerializableExtra("jeans") as? ArrayList<String>

//           var data= data?.extras
//           var alldt = (data?.getStringArrayList("jeans").toString())
//            alldata = intent.getSerializableExtra("jeans") as ArrayList<String>
        // text.setText(mylist?.get(0))


//            val myList = ArrayList<String>()
//            intent.putExtra("mylist", myList)
//            var myList = getIntent().getSerializableExtra("mylist") as ArrayList<String>

        /*
     // came back from SecondActivity
    String data = intent.getStringExtra("name");
    Toast.makeText(this, "Got back: " + data,
            Toast.LENGTH_SHORT).show();
     */

        }

    }


}

