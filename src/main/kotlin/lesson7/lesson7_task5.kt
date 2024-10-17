package org.example.lesson7

const val MIN_LENGTH_OF_PASSWORD = 6
const val DIFFERENT_TYPES_OF_SYMBOLS = 3

fun main() {
    print("Введите длину пароля для генерации (не менее $MIN_LENGTH_OF_PASSWORD): ")
    var lengthOfPassword = readln().toInt()

    while (lengthOfPassword < MIN_LENGTH_OF_PASSWORD) {
        print("Неверно. Введите длину пароля для генерации (не менее $MIN_LENGTH_OF_PASSWORD): ")
        lengthOfPassword = readln().toInt()
    }
    val generatedPassword = arrayOfNulls<String>(lengthOfPassword)

    for (i in 0 until lengthOfPassword step DIFFERENT_TYPES_OF_SYMBOLS) {
        val digit = ('A'..'Z').random().toString()
        generatedPassword[i] = digit
    }
    for (i in 1 until lengthOfPassword step DIFFERENT_TYPES_OF_SYMBOLS) {
        val digit = ('a'..'z').random().toString()
        generatedPassword[i] = digit
    }
    for (i in 2 until lengthOfPassword step DIFFERENT_TYPES_OF_SYMBOLS) {
        val digit = ('0'..'9').random().toString()
        generatedPassword[i] = digit
    }
    generatedPassword.shuffle()
    println(generatedPassword.joinToString(""))
}