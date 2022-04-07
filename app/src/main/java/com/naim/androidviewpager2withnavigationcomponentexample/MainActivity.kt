package com.naim.androidviewpager2withnavigationcomponentexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidviewpager2withnavigationcomponentexample.onlyviewpager2.OnlyViewpager2Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, OnlyViewpager2Activity::class.java))
        }
    }
}