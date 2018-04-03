package com.codekul.listtrykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.codekul.listtrykotlin.R.id.lst
import kotlinx.android.synthetic.main.activity_main.*
var rawDT : ArrayList<String> = ArrayList()
var  elementPos : Int = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         rawDT.add("ONE")
        rawDT.add("TWO")
        rawDT.add("THREE")
        rawDT.add("FOUR")
        rawDT.add("FIVE")
        rawDT.add("SIX")
        var adapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,rawDT)
        lst.adapter = adapter

        btnOk.setOnClickListener(this::added) // you can put method outside using such syntax " :: " but don't forget to pass View as Constructor


        //list onListener
        lst.setOnItemClickListener { parent, view, position, id -> et.setText(rawDT.get(position))
        Toast.makeText(this,"Touched is : "+rawDT.get(position) ,Toast.LENGTH_LONG).show()
            elementPos = position
        } // "_" to mute veriable if we are not using veriabl;e just mute it kotlin will handle other things

        lst.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this,"removed element : "+rawDT.get(position) ,Toast.LENGTH_LONG).show()
            adapter.remove(adapter.getItem(position))
            true }

  // updated data
        btnUpdate.setOnClickListener(this :: updated)
    }

  internal  fun  added(vw : View){ //function can be Internal it's almost same as Private
      (lst.adapter as ArrayAdapter<String>).add(et.text.toString())
      (lst.adapter as ArrayAdapter<String>).notifyDataSetChanged() //if ui is not getting updated use this
      et.setText("")

    }
    internal  fun updated(vw : View){
        (lst.adapter as ArrayAdapter<String>).remove(rawDT.get(elementPos))
        (lst.adapter as ArrayAdapter<String>).insert((et.text.toString()), elementPos)
        (lst.adapter as ArrayAdapter<String>).notifyDataSetChanged() //if ui is not getting updated use this
        et.setText("")
    }



}
