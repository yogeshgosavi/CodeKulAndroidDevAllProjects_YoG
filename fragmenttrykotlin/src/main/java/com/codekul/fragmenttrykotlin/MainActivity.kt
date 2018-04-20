package com.codekul.fragmenttrykotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFrag(sampleFragment.create(Color.CYAN))
    }

    //    fun loadFrag() {//
//        var txn = supportFragmentManager.beginTransaction()
//        txn.add(R.id.frameLayout, ScreenFragment())
//        txn.commit()
//    }

    /*
    backstackmanagment may not work for this program because we are using one fragment only
     */
    fun loadFrag(frag: android.support.v4.app.Fragment) {
        val tag =" ${frag :: class.java.canonicalName}-${Math.random() * 25}"
        val isPopped = supportFragmentManager.popBackStackImmediate(tag,0)

        if(!isPopped) {

            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout, frag)
                    .addToBackStack(tag)
                    .commit()
        }
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount == 1) finish() else super.onBackPressed()
    }

}
