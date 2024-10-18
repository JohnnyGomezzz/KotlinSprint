package org.example.lesson8

fun main() {
    print("Введите количество ингредиентов: ")
    val numOfIngredients = readln().toInt()

    val listOfIngredients = arrayOfNulls<String>(numOfIngredients)

    for (i in listOfIngredients.indices) {
        print("Введите ингредиент ${i + 1}: ")
        val ingredient = readln()

        listOfIngredients[i] = ingredient
    }
    println("Список ингредиентов: ${listOfIngredients.joinToString()}")
}