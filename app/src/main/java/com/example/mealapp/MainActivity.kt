package com.example.mealapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mealapp.ui.theme.MealAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealAppTheme {
                MealsCategoriesScreen()
            }
        }
    }
}

@Composable
fun MealsCategoriesScreen() {
    Text(
        text = "Hello Compose!",
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    MealAppTheme {
        MealsCategoriesScreen()
    }
}