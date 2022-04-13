package com.naim.androidviewpager2withnavigationcomponentexample.onlynavcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.ActivityOnlyNavComponentBinding

class OnlyNavigationComponentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOnlyNavComponentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}