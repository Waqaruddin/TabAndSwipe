package com.example.logintabview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    override fun getCount(): Int {
        return 2

    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> RegisterFragment()
            1 -> LoginFragment()
            else -> LoginFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Register"
            1 -> "Login"
            else -> "Login"
        }
    }


}