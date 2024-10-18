package org.example.lesson8

fun main() {
    var changeableIngredient: String
    val ingredientsOfSoup = arrayOf(
        "мясо", "картофель", "морковь", "лук", "лавровый лист", "соль", "перец", "чеснок", "зелень"
    )
    println(ingredientsOfSoup.joinToString("\n"))

    do {
        println("Какой ингредиент хотите заменить?")
        changeableIngredient = readln()

        if (!ingredientsOfSoup.contains(changeableIngredient)) {
            println("Такого ингредиента нет. Пожалуйста, выберите из списка.")
        }
    } while (!ingredientsOfSoup.contains(changeableIngredient))

    println("На какой ингредиент хотите заменить $changeableIngredient?")
    val newIngredient = readln()

    ingredientsOfSoup[ingredientsOfSoup.indexOf(changeableIngredient)] = newIngredient

    println(
        "Готово! Вы сохранили следующий список:\n" +
                ingredientsOfSoup.joinToString("\n")
    )
}