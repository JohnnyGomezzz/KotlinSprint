package org.example.lesson8

fun main() {
    val ingredientsOfSoup = arrayOf(
        "мясо", "картофель", "морковь", "лук", "лавровый лист", "соль", "перец", "чеснок", "зелень"
    )
    print("Проверить наличие в рецепте ингредиента: ")
    val sourceIngredient = readln()

    for (i in ingredientsOfSoup) {
        if (i == sourceIngredient) {
            println("Ингредиент $i в рецепте присутствует")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}