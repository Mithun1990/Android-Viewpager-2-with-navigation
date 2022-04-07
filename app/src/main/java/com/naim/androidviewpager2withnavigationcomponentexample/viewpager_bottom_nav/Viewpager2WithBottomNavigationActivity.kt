package com.naim.androidviewpager2withnavigationcomponentexample.viewpager_bottom_nav

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.naim.androidviewpager2withnavigationcomponentexample.R
import com.naim.androidviewpager2withnavigationcomponentexample.adapter.ViewPager2Adapter
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.ActivityViewpager2BottomNavBinding

class Viewpager2WithBottomNavigationActivity : AppCompatActivity() {
    private var binding: ActivityViewpager2BottomNavBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpager2BottomNavBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = ViewPager2Adapter(this)
        binding?.viewPager?.adapter = adapter
        binding?.viewPager?.registerOnPageChangeCallback(pageChangeCallback)
        binding?.bottomNavigation?.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navHome -> {
                    binding?.viewPager?.currentItem = 0
                    true
                }
                R.id.navDocument -> {
                    binding?.viewPager?.currentItem = 1
                    true
                }
                R.id.navProfile -> {
                    binding?.viewPager?.currentItem = 2
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private val pageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            when (position) {
                0 -> {
                    binding?.bottomNavigation?.menu?.findItem(R.id.navHome)?.isChecked = true
                }
                1 -> {
                    binding?.bottomNavigation?.menu?.findItem(R.id.navDocument)?.isChecked = true
                }
                2 -> {
                    binding?.bottomNavigation?.menu?.findItem(R.id.navProfile)?.isChecked = true
                }
            }
        }
    }
}