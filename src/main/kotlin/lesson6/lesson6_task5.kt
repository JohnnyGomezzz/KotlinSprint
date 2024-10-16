package org.example.lesson6

/*
Доработка задачи на авторизацию. Нужно написать часть модуля для авторизации пользователя. Для входа в приложение
пользователь должен доказать, что он не бот. Для этого программа предлагает решить простой математический пример –
сложить два числа. Имитируй эти действия в консоли, путем считывания данных с клавиатуры.

При успешном решении вход в программу символизируется сообщением “Добро пожаловать!". Дай пользователю три попытки
пройти тест. Для этого придется каждый раз генерировать новый математический пример и предлагать решить его заново.

Для простоты ограничься примерами на сложение с использованием цифр от 1 до 9. Если три попытки оказались неудачными,
вывести сообщение "Доступ запрещен".
 */

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