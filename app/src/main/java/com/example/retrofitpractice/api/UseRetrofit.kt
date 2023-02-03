package com.example.retrofitpractice.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UseRetrofit {

    const val BASE_URL = "https://api.unsplash.com/"

    val client = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun useRetrofit() : Retrofit {
        return client
    }
}