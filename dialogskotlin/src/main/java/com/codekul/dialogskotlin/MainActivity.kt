package com.codekul.dialogskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAlert.setOnClickListener {
            showDialog("Alert")

        }
        btnDatePicker.setOnClickListener {
            showDialog("DatePickerDialog")

        }
        btnTimePicker.setOnClickListener {
showDialog("TimePickerDialog")
        }
        btnCustomDialog.setOnClickListener {
showDialog("CustomDialog")
        }
        btnCurrentDate.setOnClickListener {
            showDialog("CurrentDateDialog")
        }
        btnCurrentTime.setOnClickListener {
            showDialog("CurrentTimeDialog")
        }
    }
    fun showDialog(tag : String) = BlankFragment().show(supportFragmentManager,tag)

}
