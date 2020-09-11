package com.example.logintabview

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {

 var listener:OnFragmentInteraction? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_login, container, false)
  init(view)
        return view
    }

    private fun init(view: View) {

        view.button_login.setOnClickListener {
            listener?.onLoginClicked()
        }

    }

    interface OnFragmentInteraction{
        fun onLoginClicked()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as MainActivity
    }


}