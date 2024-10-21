package org.example.lesson9

const val NUM_OF_INGREDIENTS = 5

fun main() {
    print("Перечислите $NUM_OF_INGREDIENTS необходимых ингредиентов через запятую (с пробелом): ")
    val userIngredients = readln().split(", ").sorted()

    userIngredients.forEach { println(it) }
}