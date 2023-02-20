package com.example.mealapp.model

import com.example.mealapp.model.api.MealsWebService
import com.example.mealapp.model.response.MealsCategoriesResponse


// Gets and Maps the data from the server
class MealsRepository(
    private val webService: MealsWebService = MealsWebService()
) {
    suspend fun getMeals(): MealsCategoriesResponse {
        // return webService.getMeals().execute().body() // Bad practice (on MainThread)
        return webService.getMeals()
    }
}