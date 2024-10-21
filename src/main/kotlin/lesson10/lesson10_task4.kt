package org.example.lesson10

fun main() {
    var countOfWins = 0

    while (true) {
        countOfWins += play()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        if (readln().equals("да", ignoreCase = true)) continue
        else break
    }
    println("Количество побед Человека: $countOfWins")
}

fun rollDice(name: String): Int {
    val points = (1..6).random()
    println("Бросает $name!\nВыпало $points")
    return points
}

fun play(): Int {
    var player1Points = 0
    var player2Points = 0
    val player1Name = "Человек"
    val player2Name = "Компьютер"

    var count = 0

    player1Points += rollDice(player1Name)
    player2Points += rollDice(player2Name)

    if (player1Points > player2Points) {
        println("Победил $player1Name!")
        count = 1
    }
    else if (player1Points < player2Points) {
        println("Победил $player2Name!")
    }
    else {
        println("Ничья!")
    }

    return count
}