package com.asus.kotlincountrieslandmarks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asus.kotlincountrieslandmarks.R
import com.asus.kotlincountrieslandmarks.databinding.ActivityMainBinding
import com.asus.kotlincountrieslandmarks.databinding.ActivityPicturesBinding


private lateinit var binding : ActivityPicturesBinding

class PicturesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPicturesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




    }







}