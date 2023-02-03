package com.example.retrofitpractice.model


import com.google.gson.annotations.SerializedName

data class FoodDrink(
    @SerializedName("status")
    val status: String
)