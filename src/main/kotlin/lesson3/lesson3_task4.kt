package org.example.lesson3

fun main() {
    var moveCounter = 0

    class Player(name: String, color: String) {
        val playerName = name
        val playerColor = color

        fun move(from: String, to: String) {
            moveCounter++
            println(
                String.format(
                    "%s, %s: %s-%s; %s",
                    playerName,
                    playerColor,
                    from,
                    to,
                    moveCounter
                )
            )
        }
    }

    val player1 = Player("Bob", "white")
    val player2 = Player("Peter", "black")

    player1.move("E2", "E4")
    player2.move("E7", "E5")
    player1.move("D2", "D3")
}