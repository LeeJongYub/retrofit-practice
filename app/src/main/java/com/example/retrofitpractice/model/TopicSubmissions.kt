package com.example.retrofitpractice.model


import com.google.gson.annotations.SerializedName

data class TopicSubmissions(
    @SerializedName("experimental")
    val experimental: Experimental,
    @SerializedName("food-drink")
    val foodDrink: FoodDrink
)