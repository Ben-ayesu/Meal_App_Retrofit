package com.example.mealapp.model

import com.example.mealapp.model.api.MealsWebService
import com.example.mealapp.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


// Gets and Maps the data from the server
class MealsRepository(
    private val webService: MealsWebService = MealsWebService()
) {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        // return webService.getMeals().execute().body() // Bad practice (on MainThread)
        return webService.getMeals().enqueue(object : Callback<MealsCategoriesResponse> {
            override fun onResponse(
                call: Call<MealsCategoriesResponse>,
                response: Response<MealsCategoriesResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable) {
                // ? What to do on failure
                // TODO treat failure
            }
        })
    }
}