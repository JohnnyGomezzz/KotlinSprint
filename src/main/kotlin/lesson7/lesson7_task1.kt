package org.example.lesson7

const val NUM_OF_DIGITS = 6

fun main() {
    var generatedPassword = ""

    for (i in 1..NUM_OF_DIGITS) {
        val digit = if (i % 2 == 0) {
            ('a'..'z').random().toString()
        } else {
            (0..9).random().toString()
        }
        generatedPassword += digit
    }
    println(generatedPassword)
}