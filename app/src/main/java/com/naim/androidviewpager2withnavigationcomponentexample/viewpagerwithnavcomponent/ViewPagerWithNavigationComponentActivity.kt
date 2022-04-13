package com.naim.androidviewpager2withnavigationcomponentexample.viewpagerwithnavcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView
import com.naim.androidviewpager2withnavigationcomponentexample.R
import com.naim.androidviewpager2withnavigationcomponentexample.adapter.ViewPager2Adapter
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.ActivityViewpagerWithNavComponentBinding

class ViewPagerWithNavigationComponentActivity : AppCompatActivity() {
    private var binding: ActivityViewpagerWithNavComponentBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagerWithNavComponentBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = ViewPager2Adapter(this)
        binding?.viewPager?.adapter = adapter
        binding?.bottomNavigation?.setOnItemSelectedListener(bottomNavigationController)
    }

    private val bottomNavigationController = NavigationBarView.OnItemSelectedListener {
        when (it.itemId) {
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
        }
        false
    }
}