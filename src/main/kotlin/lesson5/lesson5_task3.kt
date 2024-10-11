package org.example.lesson5

const val MIN_HIDDEN_NUMBER = 0
const val MAX_HIDDEN_NUMBER = 42
const val COUNT_OF_HIDDEN_NUMBERS = 2

fun main() {
    val hiddenNumbers = (MIN_HIDDEN_NUMBER..MAX_HIDDEN_NUMBER).shuffled().take(COUNT_OF_HIDDEN_NUMBERS)
    val firstHiddenNumber = hiddenNumbers[0]
    val secondHiddenNumber = hiddenNumbers[1]

    print(
        """
            |Приветствуем!
            |Загаданы два числа от $MIN_HIDDEN_NUMBER до $MAX_HIDDEN_NUMBER. Угадаете хотя бы одно - получите приз. 
            |А угадаете оба - аааааааааааааавтомобиль!
            |Итак, Поехали!
            |Введите первое число: 
            """.trimMargin()
    )
    val firstUserNumber = readln().toInt()

    print("Введите второе число: ")
    val secondUserNumber = readln().toInt()

    if (
        (firstUserNumber == firstHiddenNumber || firstUserNumber == secondHiddenNumber) &&
        (secondUserNumber != firstHiddenNumber && secondUserNumber != secondHiddenNumber)
    ) {
        println("Вы выиграли утешительный приз!")
    } else if (
        (firstUserNumber != firstHiddenNumber && firstUserNumber != secondHiddenNumber) &&
        (secondUserNumber == firstHiddenNumber || secondUserNumber == secondHiddenNumber)
    ) {
        println("Вы выиграли утешительный приз!")
    } else if (
        (firstUserNumber == firstHiddenNumber && secondUserNumber == secondHiddenNumber) ||
        (secondUserNumber == firstHiddenNumber && firstUserNumber == secondHiddenNumber)
    ) {
        println("Поздравляем! Вы выиграли главный приз! Аааааааааааааавтомобиль!")
    } else {
        println("Неудача!")
    }
    println("Загаданы были числа $firstHiddenNumber и $secondHiddenNumber")
}