package com.example.retrofitpractice.model


import com.google.gson.annotations.SerializedName

data class Experimental(
    @SerializedName("status")
    val status: String
)