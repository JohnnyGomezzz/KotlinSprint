package org.example.lesson10

fun main() {
    var player1Points = 0
    var player2Points = 0

    print("Введите имя, Игрок 1: ")
    val player1Name = readln()
    print("Введите имя, Игрок 2: ")
    val player2Name = readln()
    print("Введите количество раундов: ")
    val totalRounds = readln().toInt()

    for (i in 1..totalRounds) {
        player1Points += turnOf(player1Name)
        player2Points += turnOf(player2Name)
    }
    val winner = if (player1Points > player2Points) "Победил $player1Name!"
    else if (player1Points < player2Points) "Победил $player2Name!"
    else "Ничья!"

    println(
        String.format(
            "Результат: %s - %d очков, %s - %d очков. %s",
            player1Name,
            player1Points,
            player2Name,
            player2Points,
            winner
        )
    )
}

fun turnOf(name: String): Int {
    val points = (1..6).random()
    println("Бросает $name!\nВыпало $points")
    return points
}