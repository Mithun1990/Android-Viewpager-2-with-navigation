package com.naim.androidviewpager2withnavigationcomponentexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidviewpager2withnavigationcomponentexample.onlynavcomponent.OnlyNavigationComponentActivity
import com.naim.androidviewpager2withnavigationcomponentexample.onlyviewpager2.OnlyViewpager2Activity
import com.naim.androidviewpager2withnavigationcomponentexample.viewpager_bottom_nav.Viewpager2WithBottomNavigationActivity
import com.naim.androidviewpager2withnavigationcomponentexample.viewpagerwithnavcomponent.ViewPagerWithNavigationComponentActivity
import com.naim.androidviewpager2withnavigationcomponentexample.viewpagerwithtab.Viewpager2WithTabActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, OnlyViewpager2Activity::class.java))
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            startActivity(Intent(this, Viewpager2WithBottomNavigationActivity::class.java))
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            startActivity(Intent(this, Viewpager2WithTabActivity::class.java))
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            startActivity(Intent(this, ViewPagerWithNavigationComponentActivity::class.java))
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            startActivity(Intent(this, OnlyNavigationComponentActivity::class.java))
        }
    }
}