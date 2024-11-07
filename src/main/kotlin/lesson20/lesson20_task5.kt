package org.example.lesson20

fun main() {
    val robot = Robot()
    val reverseModifier: (String) -> String = {
        it: String ->
        it.reversed()
    }
    robot.say()
    robot.setModifier(reverseModifier)
    robot.say()
}

private class Robot {
    var listOfPhrases = listOf(
        "Здравствуйте",
        "Добро пожаловать",
        "Спасибо",
        "Приятно было познакомиться",
        "До свидания")

    fun say() {
        println(listOfPhrases.random())
    }

    fun setModifier(modifier: (String) -> String) {
        listOfPhrases = listOfPhrases.map { modifier(it) }
    }
}