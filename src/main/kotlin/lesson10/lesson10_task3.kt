package org.example.lesson10

fun main() {
    print("Введите длину пароля для генерации: ")
    println(generatePassword(readln().toInt()))
}

fun generatePassword(lengthOfPassword: Int): String {
    val password = mutableListOf<String>()
    val symbol = (' '..'/')
    val number = (0..9)

    for (i in 1..lengthOfPassword) {
        if (i % 2 == 0) password.add(symbol.random().toString())
        else password.add(number.random().toString())
    }
    return password.joinToString("")
}