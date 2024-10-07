package org.example.lesson3

fun main() {
    print("Введите число: ")
    val num = readln().toInt()

    for (multiplier in 1..9) {
        println(
            String.format
                (
                "%s x %s = %s",
                num,
                multiplier,
                num * multiplier
            )
        )
    }
}