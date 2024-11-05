package org.example.lesson19

fun main() {
    val ship1 = Spaceship(1, "Адмирал Кузнецов")

    ship1.takeOff()
    ship1.toLand()
    ship1.shoot()
}

private class Spaceship(
    val shipId: Int,
    val shipName: String,
) {
    fun takeOff() {
        TODO("make new logic")
    }

    fun toLand() {
        TODO()
    }

    fun shoot() {
        println("$shipName стреляет по астероидам")
    }
}