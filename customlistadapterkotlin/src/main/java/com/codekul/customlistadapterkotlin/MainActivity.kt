package com.codekul.customlistadapterkotlin

import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_item.*

class MainActivity : AppCompatActivity() {
    var rawdt : ArrayList<MyItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customAdapterDemo()
        lst.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"Touched is : "+ rawdt.get(position), Toast.LENGTH_LONG).show()
            var i = Intent(this@MainActivity, DetailedActivity::class.java)
            var bndl = Bundle()

           // var img:Int =  (view.findViewById<ImageView>(R.id.img).resources.getIdentifier( )
            var txt  = view.findViewById<TextView>(R.id.txt).text as String
          //  bndl.putInt("img" , img)
            bndl.putString("text",txt)
            i.putExtras(bndl)
            startActivity(i)


            /*
            for bitmap intent
               view.findViewById<ImageView>(R.id.img).buildDrawingCache()
            var image : Bitmap = (view.findViewById<ImageView>(R.id.img)).buildDrawingCache() as Bitmap

            bndl.putParcelable("imgbitmap", image)
             */
        }

    }
fun customAdapterDemo (){

     rawdt.add(MyItem(R.drawable.ic_wifi, "Network & Internet"))
    rawdt.add(MyItem(R.drawable.ic_device, "Connected Devices"))
    rawdt.add(MyItem(R.drawable.ic_apps, "Apps & Notifications"))
    rawdt.add(MyItem(R.drawable.ic_battery_std, "Battery"))
    rawdt.add(MyItem(R.drawable.ic_brightness, "Display"))
    rawdt.add(MyItem(R.drawable.ic_volume, "Sound"))
    rawdt.add(MyItem(R.drawable.ic_storage, "Storage"))
    rawdt.add(MyItem(R.drawable.ic_lock, "Security & Location"))
    rawdt.add(MyItem(R.drawable.ic_contacts, "Users & account"))
    rawdt.add(MyItem(R.drawable.ic_accessibility , "Accessibility"))
    rawdt.add(MyItem(R.drawable.ic_info , "Info"))
     var adapter = myAdapter(this , rawdt)
lst.adapter = adapter

}
}

