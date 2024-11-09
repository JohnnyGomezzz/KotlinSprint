package org.example.lesson20

fun main() {
    val player1 = Player1("Алёша", 25)

    val useHealingPotion: (Player1) -> Unit = { it: Player1 ->
        it.currentPlayerHealth = it.maxPlayerHealth
    }
    println(player1.currentPlayerHealth)
    useHealingPotion(player1)
    println(player1.currentPlayerHealth)
}

private class Player1(
    val playerName: String,
    var currentPlayerHealth: Int = 0,
    val maxPlayerHealth: Int = 50,
)