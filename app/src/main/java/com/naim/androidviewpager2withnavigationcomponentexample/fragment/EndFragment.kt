package com.naim.androidviewpager2withnavigationcomponentexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.naim.androidviewpager2withnavigationcomponentexample.databinding.FragmentEndBinding

class EndFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = FragmentEndBinding.inflate(inflater, container, false)
        return view.root
    }
}