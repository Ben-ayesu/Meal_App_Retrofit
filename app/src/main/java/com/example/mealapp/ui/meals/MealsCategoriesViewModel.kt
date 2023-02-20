package com.example.mealapp.ui.meals

import androidx.lifecycle.ViewModel
import com.example.mealapp.model.MealsRepository
import com.example.mealapp.model.response.MealsCategoriesResponse


//
class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}