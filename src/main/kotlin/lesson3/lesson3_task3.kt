package org.example.lesson3

fun main() {
    print("Введите число: ")
    val num = readln().toInt()

    for (multiplier in 1..9) {
        println(
            String.format
                (
                "%d x %d = %d",
                num,
                multiplier,
                num * multiplier
            )
        )
    }
}