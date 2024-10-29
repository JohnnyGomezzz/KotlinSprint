package org.example.lesson16

fun main() {
    val dice = Dice()

    dice.getPoints()
}

class Dice(
    private val points: Int = (1..6).random()
) {
    fun getPoints() {
        println(points)
    }
}