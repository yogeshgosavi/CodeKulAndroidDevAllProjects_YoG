package com.codekul.fragmenttrykotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class sampleFragment : Fragment() {

    companion object {
        fun create(col : Int ) : sampleFragment{
            val bndl = Bundle()
            bndl.putInt("keyColor",col)
            val frag = sampleFragment()
            frag.arguments = bndl
            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var rtnval = inflater!!.inflate(R.layout.fragment_sample, container, false)
        rtnval.setBackgroundColor(arguments!!.getInt("keyColor"))
        return rtnval    }


}
