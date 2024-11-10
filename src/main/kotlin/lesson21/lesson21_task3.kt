package org.example.lesson21

fun main() {
    val player1 = Player("Алёша", 25)

    println(player1.isHealthy())
}

fun Player.isHealthy(): Boolean {
    return this.currentPlayerHealth == this.maxPlayerHealth
}

class Player(
    val playerName: String,
    var currentPlayerHealth: Int = 0,
    val maxPlayerHealth: Int = 50,
)