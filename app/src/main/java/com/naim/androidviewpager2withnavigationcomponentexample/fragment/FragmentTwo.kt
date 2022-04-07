package com.naim.androidviewpager2withnavigationcomponentexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private var binding: FragmentTwoBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding?.root
    }
}