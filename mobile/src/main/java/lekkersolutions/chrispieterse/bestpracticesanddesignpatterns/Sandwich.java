package lekkersolutions.chrispieterse.bestpracticesanddesignpatterns;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

class Sandwich {
    private static final String DEBUG_TAG = "tag";

    //  Create List to hold ingredients.
    private List<Ingredient> ingredients = new ArrayList<>();

    // Calculate total calories.
    void getCalories() {
        int calories = 0;

        for (Ingredient ingredient : ingredients) {
            calories += ingredient.calories();
        }

        Log.d(DEBUG_TAG, "getCalories: Total calorie count of " + calories + "kcal");
    }

    void addIngredient (Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    void getSandwich() {
        for (Ingredient ingredient: ingredients) {
            Log.d(DEBUG_TAG, "getSandwich: " + ingredient.name() + " : " + ingredient.calories()
                    + " kcal");
        }
    }
}
