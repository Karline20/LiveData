package com.owtoph.viewmodels

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ViewSwitcher.ViewFactory
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.owtoph.viewmodels.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory()
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel
    }
}