package org.example.lesson11

fun main() {

}

class Category(
    val categoryId: Int,
    val categoryName: String,
    val recipes: MutableList<Recipe> = mutableListOf(),
) {
    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    fun removeRecipe(recipe: Recipe) {
        recipes.remove(recipe)
    }
}

class Recipe(
    val recipeId: Int,
    val recipeName: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    var isFavorite: Boolean = false,
    var cookingMethod: String,
    var numOfPortions: Int = 1,
) {
    fun addToFavorites() {
        isFavorite = true
    }

    fun removeFromFavorites() {
        isFavorite = false
    }

    fun increaseNumOfPortions() {
        numOfPortions++
    }

    fun decreaseNumOfPortions() {
        numOfPortions--
    }

    fun addCookingMethod() {
        cookingMethod = readln()
    }

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.remove(ingredient)
    }
}

class Ingredient(
    val ingredientId: Int,
    val ingredientName: String,
    val unit: String,
    val quantityPerOnePortion: Int,
)