package com.example.retrofitpractice.api

import com.example.retrofitpractice.model.DataItem
import retrofit2.http.GET
import retrofit2.http.Query

interface IRetrofit {

    @GET("photos")
    suspend fun getPhotos(
        @Query("client_id") clientId : String
    ) : List<DataItem>

}