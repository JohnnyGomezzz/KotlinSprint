package org.example.lesson8

fun main() {
    var changeableIngredient: String
    var indexOfChangeableIngredient: Int
    val ingredientsOfSoup = arrayOf(
        "мясо", "картофель", "морковь", "лук", "лавровый лист", "соль", "перец", "чеснок", "зелень"
    )
    println(ingredientsOfSoup.joinToString("\n"))

    do {
        println("Какой ингредиент хотите заменить?")
        changeableIngredient = readln()

        indexOfChangeableIngredient = ingredientsOfSoup.indexOf(changeableIngredient)

        if (indexOfChangeableIngredient == -1) {
            println("Такого ингредиента нет. Пожалуйста, выберите из списка.")
        }
    } while (indexOfChangeableIngredient == -1)

    println("На какой ингредиент хотите заменить $changeableIngredient?")
    val newIngredient = readln()

    ingredientsOfSoup[indexOfChangeableIngredient] = newIngredient

    println(
        "Готово! Вы сохранили следующий список:\n" +
                ingredientsOfSoup.joinToString("\n")
    )
}