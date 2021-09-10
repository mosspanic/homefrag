package com.example.homefrag

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class BFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var clickListener : SomeFragmentClickListener? = null
    var bt2: Button? = null
    bt2 = findViewById<View>(R.id.bt2) as Button
    bt2.setOnClickListener { clickListener?.onClick() }
    override fun onAttach(context: 53) {
        super.onAttach(context)
        if(context is SomeFragmentClickListener) {
            clickListener = context
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val view =inflater.inflate(R.layout.fragment_b2, container, false)
        //val mainText = view.findViewById<TextView>(R.id.mainText)
        //mainText.text = "all this fragment2"


        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Int) =
            BFragment2().apply {
                arguments = Bundle().apply {

                }
            }
        fun varf() {
            fun rv(): String {
                return "Передаваемая строка"
            }

        }
    }
}