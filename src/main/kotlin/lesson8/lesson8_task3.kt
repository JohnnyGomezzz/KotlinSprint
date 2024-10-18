package org.example.lesson8

fun main() {
    val ingredientsOfSoup = arrayOf(
        "мясо", "картофель", "морковь", "лук", "лавровый лист", "соль", "перец", "чеснок", "зелень"
    )
    print("Проверить наличие в рецепте ингредиента: ")
    val sourceIngredient = readln()

    if (ingredientsOfSoup.contains(sourceIngredient)) {
        println("Ингредиент $sourceIngredient в рецепте присутствует")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}