package com.example.mealapp.model

import com.example.mealapp.model.response.MealsCategoryResponse


// Gets and Maps the data from the server
class MealsRepository {
    fun getMeals(): MealsCategoryResponse = MealsCategoryResponse(arrayListOf())
}