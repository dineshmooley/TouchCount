package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.assignment2.databinding.FragmentTouchBinding

class TouchFragment : Fragment() {

    private lateinit var viewModel: TouchViewModel
    private lateinit var binding: FragmentTouchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using DataBindingUtil
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_touch, container, false)

        // Initialize ViewModel
        viewModel = ViewModelProvider(this)[TouchViewModel::class.java]

        binding.touchViewModel = viewModel
        binding.setLifecycleOwner(this)
        // Return the binding root view
        return binding.root
    }
}
