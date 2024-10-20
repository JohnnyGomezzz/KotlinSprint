package org.example.lesson9

fun main() {
    val listOfIngredients = mutableListOf("яйца", "растительное масло", "соль")
    println(
        "В рецепте есть базовые ингредиенты: " +
                listOfIngredients.joinToString()
    )
    print("Желаете добавить еще? (да/нет): ")
    if (!readln().equals("да", true)) return

    print("Какой ингредиент вы хотите добавить? ")
    val additionalIngredient = readln()
    listOfIngredients.add(additionalIngredient)

    println(
        "Теперь в рецепте есть следующие ингредиенты: " +
                listOfIngredients.joinToString()
    )
}