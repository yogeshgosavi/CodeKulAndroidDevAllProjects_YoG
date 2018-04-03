package com.codekul.customlistadapterkotlin

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

data class MyItem(
        val img: Int,
        val txt: String
)
class myAdapter (
        private val context: Context,
        private val rawData : ArrayList<MyItem> // " * " means any type
): BaseAdapter() {
    private val inflater : LayoutInflater by lazy {
        LayoutInflater.from(context)
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
val vw= inflater.inflate(
        R.layout.my_item,
        parent,
        false
)
        vw.findViewById<ImageView>(R.id.img).setImageResource(rawData[position].img)
        vw.findViewById<TextView>(R.id.txt).text = (rawData[position].txt)
return vw
    }

    override fun getItem(position: Int): Any {
return rawData[position]
    }

    override fun getItemId(position: Int): Long {
  return  (position*9).toLong()
    }

    override fun getCount(): Int {
return  rawData.size
    }
}
