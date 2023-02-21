package com.example.mealapp.model

import com.example.mealapp.model.api.MealsWebService
import com.example.mealapp.model.response.MealResponse
import com.example.mealapp.model.response.MealsCategoriesResponse


// Gets and Maps the data from the server
class MealsRepository(
    private val webService: MealsWebService = MealsWebService()
) {
    private var cachedMeals = listOf<MealResponse>()
    suspend fun getMeals(): MealsCategoriesResponse {
        val response = webService.getMeals()
        cachedMeals = response.categories
        // return webService.getMeals().execute().body() // Bad practice (on MainThread)
        return response
    }

    fun getMeal(id: String): MealResponse? {
        return cachedMeals.firstOrNull {
            it.id == id
        }
    }

    companion object {
        @Volatile
        private var instance: MealsRepository? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: MealsRepository().also { instance = it }
        }
    }
}