package org.example.lesson6

fun main() {
    print("Введите количество секунд, которое необходимо засечь: ")
    val totalSeconds = readln().toInt()

    var counter = 0

    while (totalSeconds != counter) {
        Thread.sleep(1000)
        counter++
    }
    println("Прошло $totalSeconds секунд")
}