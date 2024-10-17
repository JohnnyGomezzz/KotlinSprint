package org.example.lesson7

fun main() {
    print("Введите количество секунд, которое необходимо засечь: ")
    val sourceTime = readln().toInt()

    for (i in sourceTime downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}