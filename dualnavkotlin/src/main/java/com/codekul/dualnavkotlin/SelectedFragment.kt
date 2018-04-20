package com.codekul.dualnavkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SelectedFragment : Fragment() {
    companion object {
        fun create(img : Int ) : SelectedFragment{
            val bndl = Bundle()
            bndl.putInt("keyImg",img)
            val frag = SelectedFragment()
            frag.arguments = bndl
            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var rtnval =inflater!!.inflate(R.layout.fragment_selected, container, false)
        ( rtnval.findViewById<ImageView>(R.id.selimg).setBackgroundResource(arguments!!.getInt("keyImg")))
        //(arguments!!.getInt("keyIm"))
        // Inflate the layout for this fragment
        return rtnval
    }


}
