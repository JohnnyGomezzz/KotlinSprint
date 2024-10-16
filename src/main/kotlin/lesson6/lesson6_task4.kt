package org.example.lesson6

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUM_OF_ATTEMPTS = 5

fun main() {
    val hiddenNumber = (MIN_NUMBER..MAX_NUMBER).random()

    println("Загадано число от $MIN_NUMBER до $MAX_NUMBER. У вас есть $NUM_OF_ATTEMPTS попыток, чтобы угадать его.")

    var countOfAttempts = NUM_OF_ATTEMPTS

    do {
        print("Введите число: ")
        val guessedNumber = readln().toInt()

        countOfAttempts--

        if (guessedNumber == hiddenNumber) {
            println("Угадали! Это была великолепная игра!")
            break
        } else if (countOfAttempts == 0) {
            println("К сожалению, вам не удалось угадать число. Попробуйте в другой раз.")
        } else {
            println("Пока не угадали. Осталось попыток: $countOfAttempts")
        }
    } while (countOfAttempts != 0)

    println("Было загадано число $hiddenNumber")
}