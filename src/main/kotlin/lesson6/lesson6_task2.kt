package org.example.lesson6

fun main() {
    print("Введите количество секунд, которое необходимо засечь: ")
    val totalSeconds = readln().toLong()

    Thread.sleep(1000 * totalSeconds)

    println("Прошло $totalSeconds секунд")
}