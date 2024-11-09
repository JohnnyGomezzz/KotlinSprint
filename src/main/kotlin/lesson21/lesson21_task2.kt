package org.example.lesson21

fun main() {
    val listOfInt: List<Int> = listOf(457, 343, 76, 23, 97, 54)

    println(listOfInt.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0

    this.forEach { if (it % 2 == 0) sum += it }
    return sum
}