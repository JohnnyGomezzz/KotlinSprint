package org.example.lesson18

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val dices: List<Dice> = listOf(dice1, dice2, dice3)

    dices.forEach { println(it.drop()) }
}

open class Dice(
    private val points: Int,
) {
    fun drop() = points
}

class Dice4 : Dice(
    points = (1..4).random()
)

class Dice6 : Dice(
    points = (1..6).random()
)

class Dice8 : Dice(
    points = (1..8).random()
)