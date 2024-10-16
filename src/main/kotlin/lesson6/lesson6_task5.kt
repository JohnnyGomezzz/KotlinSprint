package org.example.lesson6

const val MIN_NUM_FOR_EX = 1
const val MAX_NUM_FOR_EX = 9
const val NUM_OF_EX_ATTEMPTS = 3

fun main() {
    var countOfAttempts = NUM_OF_EX_ATTEMPTS

    println(
        "Пожалуйста, докажите, что вы не бот.\n" +
                "Для этого решите простой пример: "
    )

    do {
        val firstNum = (MIN_NUM_FOR_EX..MAX_NUM_FOR_EX).random()
        val secondNum = (MIN_NUM_FOR_EX..MAX_NUM_FOR_EX).random()

        print("Сколько будет $firstNum + $secondNum? ")
        val answer = readln().toInt()

        countOfAttempts--

        if (answer == firstNum + secondNum) {
            println("Добро пожаловать!")
            break
        } else if (countOfAttempts == 0) {
            println("Доступ запрещён!")
        } else {
            println("Ответ неверный. Осталось попыток: $countOfAttempts")
        }
    } while (countOfAttempts != 0)
}