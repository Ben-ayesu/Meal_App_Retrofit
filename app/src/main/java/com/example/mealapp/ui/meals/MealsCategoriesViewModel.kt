package com.example.mealapp.ui.meals

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealapp.model.MealsRepository
import com.example.mealapp.model.response.MealResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//
class MealsCategoriesViewModel(
    private val repository: MealsRepository = MealsRepository()
): ViewModel() {

    init {
        Log.i("TAG_COROUTINE", "About to launch a coroutine") // 1st
        viewModelScope.launch(Dispatchers.IO) {
            Log.i("TAG_COROUTINE", "We have launched the coroutine") // 3rd
            val meals = getMeals()
            Log.i("TAG_COROUTINE", "We have received the async data") // 4th
            mealState.value = meals
        }
        Log.i("TAG_COROUTINE", "other work") // 2

    }

    val mealState = mutableStateOf(emptyList<MealResponse>())

    private suspend fun getMeals(): List<MealResponse> {
        return repository.getMeals().categories
    }
}