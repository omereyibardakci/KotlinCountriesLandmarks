package com.asus.kotlincountrieslandmarks.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.asus.kotlincountrieslandmarks.R
import com.asus.kotlincountrieslandmarks.adapter.LandmarksAdapter
import com.asus.kotlincountrieslandmarks.databinding.ActivityMainBinding
import com.asus.kotlincountrieslandmarks.model.Landmarks



private lateinit var binding : ActivityMainBinding

private lateinit var landmarksArrayList : ArrayList<Landmarks>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarksArrayList = ArrayList<Landmarks>()

        val pisa = Landmarks("Pisa","Italy",R.drawable.pisa)
        val eiffel =Landmarks("Eiffel","France",R.drawable.eiffel)
        val pyramids = Landmarks("Pyramids","Egypt",R.drawable.pyramids)
        val tacmahal =Landmarks("Tac Mahal","India",R.drawable.tacmahal)
        val liberty = Landmarks("Liberty","USA",R.drawable.liberty)


        landmarksArrayList.add(pisa)
        landmarksArrayList.add(eiffel)
        landmarksArrayList.add(pyramids)
        landmarksArrayList.add(tacmahal)
        landmarksArrayList.add(liberty)





        //  recycleView
        binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        val landmarksAdapter = LandmarksAdapter(landmarksArrayList)
        binding.recyclerView.adapter = landmarksAdapter




    }




}