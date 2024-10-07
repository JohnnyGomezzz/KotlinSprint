package org.example.lesson2

fun main() {
    val numberOfStudents = 4
    val score1 = 3.0
    val score2 = 4.0
    val score3 = 3.0
    val score4 = 5.0

    val averageClassScore = (score1 + score2 + score3 + score4) / numberOfStudents

    println(String.format("%.2f", averageClassScore))
}