package com.codekul.fragmenttrykotlin


import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


/**
 * A simple [Fragment] subclass.
 *
 */
class BlankFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        var rtnval = inflater!!.inflate(R.layout.fragment_blank, container, false)
        rtnval.findViewById<Button>(R.id.btnmic).setOnClickListener {
            //    (activity as MainActivity ).loadFrag(MicFragment())
            (activity as MainActivity).loadFrag(sampleFragment.create(Color.RED))
        }
        rtnval.findViewById<Button>(R.id.btnmouse).setOnClickListener {
            //      (activity as MainActivity ).loadFrag(MouseFragment())
            (activity as MainActivity).loadFrag(sampleFragment.create(Color.BLUE))

        }

        rtnval.findViewById<Button>(R.id.btnscreen).setOnClickListener {
            //(activity as MainActivity ).loadFrag(ScreenFragment())
            (activity as MainActivity).loadFrag(sampleFragment.create(Color.YELLOW))

        }

        return rtnval    }


}
