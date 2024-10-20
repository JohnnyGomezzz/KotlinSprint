package org.example.lesson9

fun main() {
    val listOfIngredients = listOf(
        "молоко", "кефир", "мука", "яйца", "сахар", "растительное масло", "соль", "разрыхлитель"
    )
    println("В рецепте есть следующие ингредиенты: ")
    listOfIngredients.forEach {
        println(it)
    }
}