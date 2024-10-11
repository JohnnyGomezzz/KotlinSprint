package org.example.lesson5

fun main() {
    val firstNum = 42
    val secondNum = 42

    print("Докажите, что вы не бот. Сложите $firstNum и $secondNum: ")
    val checkResult = readln().toInt()

    if (checkResult == firstNum + secondNum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }
}