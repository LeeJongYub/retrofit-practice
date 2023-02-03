package com.example.retrofitpractice.repository

import com.example.retrofitpractice.Constant
import com.example.retrofitpractice.api.IRetrofit
import com.example.retrofitpractice.api.UseRetrofit

class Repository {

    private val apiRepository = UseRetrofit.useRetrofit().create(IRetrofit::class.java)

    suspend fun getPhotoData() = apiRepository.getPhotos(Constant.CLIENT_ID)

}