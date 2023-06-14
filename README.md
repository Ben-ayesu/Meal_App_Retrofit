## Meals App
The Meals App is an Android application that fetches data from the MealsDatabase API and displays meals in a list of cards. Users can click on a meal card to view detailed information about the meal. The app is built using Jetpack Compose, GitHub, MVVM architecture, Android Studio, Navigation component, Coil for image loading, and Retrofit for network requests.

## Features
- Fetches data from the MealsDatabase API.
- Displays meals in a list of cards.
- Allows users to click on a meal card to view detailed information about the meal.
- Utilizes Jetpack Compose for building the UI.
- Uses MVVM architecture for separation of concerns.
- Integrates with GitHub for version control and collaboration.
- Uses Retrofit for handling network requests.
- Utilizes Coil, an image loading library, for displaying images.

## Getting Started
To get started with the Meals App project, follow these steps:

1. Clone the repository:
```
git clone https://github.com/your-username/meals-app.git
```
2. Open the project in Android Studio.
3. Build the project to download the required dependencies.
4. Run the app on an emulator or a connected device.

## Dependencies
The following dependencies are used in the app:

- Jetpack Compose: A modern UI toolkit for building native Android apps.
-Navigation Compose: A navigation library for Jetpack Compose.
-MVVM architecture: Used to separate concerns and provide a clear structure to the app.
-Coroutines: A library for asynchronous programming and managing concurrency.
-Coil: An image loading library for Android apps.
-Retrofit: A type-safe HTTP client for Android and Java.Coil: Image Loading Library

## Architecture
The Meals App follows the MVVM (Model-View-ViewModel) architecture pattern. Here's a brief overview of each component:

-Model: Represents the data structure and business logic of the app. It includes classes for fetching data from the MealsDatabase API using Retrofit.
-View: Responsible for rendering the UI using Jetpack Compose. It includes classes for displaying the list of meals and the meal detail screen.
-ViewModel: Acts as a bridge between the Model and View components. It holds and manages the UI-related data required by the View and communicates with the Model to fetch data.

## Screenshots
![Screenshot_20230225_234615](https://github.com/Ben-ayesu/Meal_App_Retrofit/assets/19813169/72998575-2b6e-4aa8-9d9b-fc4fe696b81f)

## Contributing
Contributions are welcome! Please open an issue or submit a pull request.
