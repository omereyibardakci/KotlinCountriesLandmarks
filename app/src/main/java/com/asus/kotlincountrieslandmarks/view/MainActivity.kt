package com.asus.kotlincountrieslandmarks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asus.kotlincountrieslandmarks.R
import com.asus.kotlincountrieslandmarks.databinding.ActivityMainBinding


private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        

    }











}