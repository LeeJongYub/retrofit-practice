package com.example.retrofitpractice.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitpractice.model.DataItem
import com.example.retrofitpractice.repository.Repository
import kotlinx.coroutines.launch

class RetrofitViewModel : ViewModel() {

    private val repository = Repository()

    private val _livePhotoData = MutableLiveData<List<DataItem>>()
    val livePhotoData get() = _livePhotoData

    fun getDataViewModel() = viewModelScope.launch {

        _livePhotoData.value = repository.getPhotoData()
        Log.d("data", repository.getPhotoData().toString())
    }

}