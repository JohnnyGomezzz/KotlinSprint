package org.example.lesson2

import kotlin.math.pow

fun main() {
    val startSum = 70_000
    val rate = 16.7
    val depositPeriod = 20

    val totalSum = startSum * (1 + rate / 100).pow(depositPeriod)

    println(String.format("%.3f", totalSum))

}