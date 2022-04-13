package com.naim.androidviewpager2withnavigationcomponentexample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.naim.androidviewpager2withnavigationcomponentexample.fragment.FragmentOne
import com.naim.androidviewpager2withnavigationcomponentexample.fragment.FragmentTwo
import com.naim.androidviewpager2withnavigationcomponentexample.fragment.MainFragment

class ViewPager2Adapter constructor(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    private val fragmentList = mutableListOf<Fragment>()

    init {
        fragmentList.clear()
        fragmentList.add(MainFragment())
        fragmentList.add(FragmentOne())
        fragmentList.add(FragmentTwo())
//        fragmentList.add(FragmentThree())
    }

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}