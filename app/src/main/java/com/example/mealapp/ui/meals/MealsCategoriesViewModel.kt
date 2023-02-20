package com.example.mealapp.ui.meals

import androidx.lifecycle.ViewModel
import com.example.mealapp.model.MealsRepository
import com.example.mealapp.model.response.MealResponse

//
class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
): ViewModel() {
    suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}