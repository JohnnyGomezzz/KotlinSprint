package org.example.lesson9

fun main() {
    print("Перечислите 5 необходимых ингредиентов через запятую (с пробелом): ")
    val userIngredients = readln().split(", ")

    val sortedIngredients = userIngredients.sorted()
    sortedIngredients.forEach { println(it) }
}