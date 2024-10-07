package org.example.lesson2

import kotlin.math.pow

const val PERCENTS = 100

fun main() {
    val startSum = 70_000
    val increasingRatio = 1
    val rate = 16.7
    val depositPeriod = 20

    val totalSum = startSum * (increasingRatio + rate / PERCENTS).pow(depositPeriod)

    println(String.format("%.3f", totalSum))

}