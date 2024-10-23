package org.example.lesson10

fun main() {
    var countOfWins = 0

    while (true) {
        countOfWins += play("Человек", "Компьютер")
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

fun play(player1Name: String, player2Name: String): Int {
    var player1Points = 0
    var player2Points = 0

    player1Points += rollDice(player1Name)
    player2Points += rollDice(player2Name)

    if(win(player1Points, player2Points)) return 1
    return 0
}

fun win(player1Points: Int, player2Points: Int) = player1Points > player2Points