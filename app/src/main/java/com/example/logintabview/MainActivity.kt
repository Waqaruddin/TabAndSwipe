package com.example.logintabview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), LoginFragment.OnFragmentInteraction,
    RegisterFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }


    private fun init() {
        var myAdaper = MyAdapter(supportFragmentManager)
        view_pager.adapter = myAdaper
        tab_layout.setupWithViewPager(view_pager)

    }


    override fun onLoginClicked() {
tab_layout.getTabAt(0)?.select()    }

    override fun onRegisterClicked() {
tab_layout.getTabAt(1)?.select()    }
}