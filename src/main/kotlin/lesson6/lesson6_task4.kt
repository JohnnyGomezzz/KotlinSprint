package org.example.lesson6

/*
Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9. Игроку дается 5 попыток, чтобы
угадать это число.

 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.
 */

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
            break
        } else {
            println("Пока не угадали. Осталось попыток: $countOfAttempts")
        }
    } while (countOfAttempts != 0)

    println("Было загадано число $hiddenNumber")
}