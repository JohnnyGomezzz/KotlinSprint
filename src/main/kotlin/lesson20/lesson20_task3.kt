package org.example.lesson20

fun main() {
    val player1 = Player("Алёша")

    val theDoor: (Player) -> Unit = { it: Player ->
        println(if (it.haveKey) "${it.playerName} открыл дверь" else "Дверь заперта")
    }
    theDoor(player1)
}

private class Player(
    val playerName: String,
    var haveKey: Boolean = false,
)