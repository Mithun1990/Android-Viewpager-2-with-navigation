package com.naim.androidviewpager2withnavigationcomponentexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    private var binding: FragmentOneBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding?.root
    }
}