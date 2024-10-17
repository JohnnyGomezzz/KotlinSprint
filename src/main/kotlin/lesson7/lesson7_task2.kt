package org.example.lesson7

fun main() {
    do {
        val smsCode = (1000..9999).random()

        print(
            "Ваш код авторизации: $smsCode\n" +
                    "Введите код: "
        )
        val authCode = readln().toInt()

    } while (authCode != smsCode)

    println("Добро пожаловать!")
}