package com.naim.androidviewpager2withnavigationcomponentexample.onlyviewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidviewpager2withnavigationcomponentexample.adapter.ViewPager2Adapter
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.ActivtyOnlyViewpager2Binding

class OnlyViewpager2Activity : AppCompatActivity() {
    private var binding: ActivtyOnlyViewpager2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivtyOnlyViewpager2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = ViewPager2Adapter(this)
        binding?.viewPager?.adapter = adapter
    }
}