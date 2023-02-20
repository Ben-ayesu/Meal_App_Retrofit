package com.example.mealapp.model.response

import com.google.gson.annotations.SerializedName

// Gson deserialization:
// JSON -> data classes

// Classes will not have any logic
// Called Dummy classes to transport some data
data class MealsCategoriesResponse(val categories: List<MealResponse>)

data class MealResponse(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryDescription") val description: String,
    @SerializedName("strCategoryThumb") val imageUrl: String
    )

