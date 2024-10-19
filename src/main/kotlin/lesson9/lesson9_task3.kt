package org.example.lesson9

fun main() {
    val omeletRecipe = listOf(2, 50, 15)

    print("Сколько порций омлета понадобится? ")
    val numOfPortions = readln().toInt()

    val numOfIngredientsForSeveralPortions = omeletRecipe.map { it * numOfPortions }
    println(
        String.format(
            "На %d порций вам понадобится: Яиц – %d шт, молока – %d мл, сливочного масла – %d г",
            numOfPortions,
            numOfIngredientsForSeveralPortions[0],
            numOfIngredientsForSeveralPortions[1],
            numOfIngredientsForSeveralPortions[2]
        )
    )
}