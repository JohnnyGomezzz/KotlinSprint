package org.example.lesson5

const val MIN_HIDDEN_NUM = 0
const val MAX_HIDDEN_NUM = 42
const val COUNT_OF_HIDDEN_NUMS = 3

fun main() {
    val hiddenNumbers = (MIN_HIDDEN_NUM..MAX_HIDDEN_NUM).shuffled().take(COUNT_OF_HIDDEN_NUMS)

    print(
        """
            |Приветствуем!
            |Загаданы три числа от $MIN_HIDDEN_NUM до $MAX_HIDDEN_NUM. Угадаете хотя бы одно - получите утешительный приз.
            |Угадаете два числа - получите крупный денежный приз. 
            |А угадаете все три - аааааааааааааавтомобиль!
            |Итак, Поехали!
            |Введите первое число: 
            """.trimMargin()
    )
    val firstUserNumber = readln().toInt()

    print("Введите второе число: ")
    val secondUserNumber = readln().toInt()

    print("Введите третье число: ")
    val thirdUserNumber = readln().toInt()

    val userNumbers = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)

    val countOfGuessedNumbers = hiddenNumbers.intersect(userNumbers).size

    when (countOfGuessedNumbers) {
        1 -> {
            println("Угадано одно число. Вы выиграли утешительный приз!")
        }

        2 -> {
            println("Угадано два числа. Вы выиграли миллион рублей!")
        }

        3 -> {
            println("Угаданы все три числа. Поздравляем! Вы выиграли главный приз! Аааааааааааааавтомобиль!")
        }

        else -> {
            println("К сожалению, вы не угадали ни одного числа. Попробуйте в другой раз.")
        }
    }

    println(
        "Загаданы были числа " +
                hiddenNumbers.joinToString(", ")
    )
}