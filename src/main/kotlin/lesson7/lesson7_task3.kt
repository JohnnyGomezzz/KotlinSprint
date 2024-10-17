package org.example.lesson7

fun main() {
    print("Введите число: ")
    val sourceNum = readln().toInt()

    for (i in 0..sourceNum step 2) {
        println(i)
    }
}