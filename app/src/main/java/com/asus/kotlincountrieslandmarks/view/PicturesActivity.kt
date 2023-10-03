package com.asus.kotlincountrieslandmarks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asus.kotlincountrieslandmarks.R
import com.asus.kotlincountrieslandmarks.databinding.ActivityMainBinding
import com.asus.kotlincountrieslandmarks.databinding.ActivityPicturesBinding
import com.asus.kotlincountrieslandmarks.model.Landmarks


private lateinit var binding : ActivityPicturesBinding

class PicturesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPicturesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intent = intent

        // casting

        // as ifadesini kullanarak döndürülen değerin kesinlikle Landmarks nesnesi olduğunu söylüyorum.
        // By using the 'as' expression, I say that the returned value is definitely the Landmarks object.

        val selectedLandmarks = intent.getSerializableExtra("landmarks") as Landmarks
        binding.textViewName.text = selectedLandmarks.name
        binding.textViewCountry.text = selectedLandmarks.country
        selectedLandmarks.picture?.let { binding.imageView.setImageResource(it) }


    }







}