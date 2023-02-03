package com.example.retrofitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitpractice.adapter.RvAdapter
import com.example.retrofitpractice.model.DataItem
import com.example.retrofitpractice.viewmodel.RetrofitViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(RetrofitViewModel::class.java)

        viewModel.getDataViewModel()

        val rv = findViewById<RecyclerView>(R.id.main_rv)

        viewModel.livePhotoData.observe(this, Observer {
            rvAdapter = RvAdapter(it as ArrayList<DataItem>)
            rv.adapter = rvAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })
    }
}