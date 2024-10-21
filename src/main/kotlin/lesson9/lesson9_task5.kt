package org.example.lesson9

import java.util.*

const val NUM_OF_INGREDIENTS = 5

fun main() {
    println("Введите поочерёдно $NUM_OF_INGREDIENTS ингредиентов.")

    val userIngredients: MutableList<String> = mutableListOf()
    var counter = 1

    while (counter <= NUM_OF_INGREDIENTS) {
        print("Введите ингредиент $counter: ")
        val ingredient = readln()

        if (ingredient in userIngredients) {
            println("Такой ингредиент уже есть в списке.")
            continue
        }
        userIngredients.add(ingredient)
        counter++
    }
    userIngredients.toSet()
    println(userIngredients.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}