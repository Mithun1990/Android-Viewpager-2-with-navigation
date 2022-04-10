package com.naim.androidviewpager2withnavigationcomponentexample.viewpagerwithtab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import com.naim.androidviewpager2withnavigationcomponentexample.R
import com.naim.androidviewpager2withnavigationcomponentexample.adapter.ViewPager2Adapter
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.ActivityViewpager2TabLayoutBinding

class Viewpager2WithTabActivity : AppCompatActivity() {
    private var binding: ActivityViewpager2TabLayoutBinding? = null
    private val tabTiles by lazy { arrayOf("Home", "Document", "Profile") }
    private val tabIcon by lazy {
        arrayOf(
            R.drawable.ic_bottom_menu_home,
            R.drawable.ic_bottom_menu_documents, R.drawable.ic_bottom_menu_profile
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpager2TabLayoutBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = ViewPager2Adapter(this)
        binding?.viewPager?.adapter = adapter
        TabLayoutMediator(binding?.tabLayout!!, binding?.viewPager!!) { tab, position ->
            tab.text = tabTiles[position]
            tab.icon = ResourcesCompat.getDrawable(resources, tabIcon[position], null)
        }.attach()
    }
}