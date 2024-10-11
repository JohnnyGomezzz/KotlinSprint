package org.example.lesson5

fun main() {
    print("Докажите, что вы не бот. Сложите 42 и 42: ")
    val checkResult = readln().toInt()

    if (checkResult == 84) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }
}