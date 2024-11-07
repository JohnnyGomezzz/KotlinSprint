package org.example.lesson20

fun main() {
    val player1 = Player("Алёша", 25)

    val useHealingPotion: (Player) -> Unit = { it: Player ->
        it.currentPlayerHealth = it.maxPlayerHealth
    }
    println(player1.currentPlayerHealth)
    useHealingPotion(player1)
    println(player1.currentPlayerHealth)
}

private class Player(
    val playerName: String,
    var currentPlayerHealth: Int = 0,
    val maxPlayerHealth: Int = 50,
)