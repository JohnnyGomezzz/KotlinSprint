package org.example.lesson10

fun main() {
    val player1 = "Человек"
    val player2 = "Компьютер"
    var player1wins = 0
    var player2wins = 0
    var result: Int

    while (true) {
        result = playRound(player1, player2)

        if (result > 0) {
            println("Победил $player1!")
            player1wins ++
        } else if (result < 0) {
            println("Победил $player2!")
            player2wins ++
        } else println("Ничья!")

        println("Хотите сыграть ещё раунд? (да/нет)")
        if (readln().equals("да", ignoreCase = true)) continue
        break
    }
    println(
        String.format(
            """|Количество побед:
            |%s - %d
            |%s - %d
        """.trimMargin(),
            player1,
            player1wins,
            player2,
            player2wins
        )
    )
}

fun diceThrow(playerName: String): Int {
    val points = (1..6).random()

    println("Бросает $playerName. Выпало $points")

    return points
}

fun playRound(player1: String, player2: String) = diceThrow(player1) - diceThrow(player2)