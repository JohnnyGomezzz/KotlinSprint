package org.example.lesson10

fun main() {
    print("Введите длину пароля для генерации: ")
    println(generatePassword(readln().toInt()))
}

fun generatePassword(lengthOfPassword: Int): String {
    val password = mutableListOf<String>()

    for (i in 1..lengthOfPassword) {
        val number = (0..9).random().toString()
        val symbol = "!\"#\$%&'()*+,-./ ".split("").random()

        if (i % 2 == 0) password.add(symbol)
        else password.add(number)
    }
    return password.joinToString("")
}