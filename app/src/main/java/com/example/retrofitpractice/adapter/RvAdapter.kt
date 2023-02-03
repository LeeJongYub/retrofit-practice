package com.example.retrofitpractice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofitpractice.MyApp
import com.example.retrofitpractice.R
import com.example.retrofitpractice.model.DataItem

class RvAdapter(val dataList: ArrayList<DataItem>) : RecyclerView.Adapter<RvAdapter.RvViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)

        return RvViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.idText.text = dataList[position].id
        Glide.with(MyApp.instance)
            .load(dataList[position].urls.small)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.urlImage)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class RvViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val idText = itemView.findViewById<TextView>(R.id.textArea)
        val urlImage = itemView.findViewById<ImageView>(R.id.imageArea)
    }
}