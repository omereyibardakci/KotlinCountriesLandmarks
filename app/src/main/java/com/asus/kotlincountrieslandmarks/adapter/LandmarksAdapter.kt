package com.asus.kotlincountrieslandmarks.adapter

import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asus.kotlincountrieslandmarks.databinding.RecyclerRowBinding
import com.asus.kotlincountrieslandmarks.model.Landmarks
import com.asus.kotlincountrieslandmarks.view.PicturesActivity

class LandmarksAdapter(val landmarksArrayList : ArrayList<Landmarks>) : RecyclerView.Adapter<LandmarksAdapter.LandmarksHolder>() {

    class LandmarksHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

        //  root statement converts binding to view
        // for java is    getRoot()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarksHolder {
        // 'inflate' reads the XML layout file
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarksHolder(binding)

    }

    override fun getItemCount(): Int {
        return landmarksArrayList.size
    }

    override fun onBindViewHolder(holder: LandmarksHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarksArrayList.get(position).name
        holder.itemView.setOnClickListener {

        val intent = Intent(holder.itemView.context,PicturesActivity::class.java)
        // ::class statement gives reference

        intent.putExtra("landmarks",landmarksArrayList.get(position))       // We have to make it serializable -> Landmarks.kt
        holder.itemView.context.startActivity(intent)


        }


    }


}