package org.example.lesson8

fun main() {
    val ingredientsOfSoup = arrayOf(
        "мясо", "картофель", "морковь", "лук", "лавровый лист", "соль", "перец", "чеснок", "зелень"
    )
    print("Проверить наличие в рецепте ингредиента: ")
    val sourceIngredient = readln()

    for (i in ingredientsOfSoup.indices) {
        if (ingredientsOfSoup[i] == sourceIngredient) {
            println("Ингредиент ${ingredientsOfSoup[i]} в рецепте присутствует")
            break
        } else if (i == ingredientsOfSoup.size - 1) {
            println("Такого ингредиента в рецепте нет")
        }
    }
}