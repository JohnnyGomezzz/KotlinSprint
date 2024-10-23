package org.example.lesson11

fun main() {

}

class Category(
    val categoryId: Int,
    val categoryName: String,
    val imageUrl: String,
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
    val imageUrl: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    var isFavorite: Boolean = false,
    var cookingMethod: MutableList<String> = mutableListOf(),
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

    fun addCookingMethod(method: String) {
        cookingMethod.add(method)
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