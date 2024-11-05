package org.example.lesson18

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val dices: List<Dice> = listOf(dice1, dice2, dice3)

    dices.forEach { println(it.drop()) }
}

open class Dice {

    open fun drop() = 0
}

class Dice4 : Dice() {
    private val points = (1..4).random()

    override fun drop(): Int {
        return points
    }
}

class Dice6 : Dice() {
    private val points = (1..6).random()

    override fun drop(): Int {
        return points
    }
}

class Dice8 : Dice() {
    private val points = (1..8).random()

    override fun drop(): Int {
        return points
    }
}