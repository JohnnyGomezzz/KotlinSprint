package org.example.lesson16

import kotlin.math.pow

private const val PI = 3.14f

fun main() {
    val circle = Circle(5.0f)

    println(circle.perimeter())
    println(circle.area())
}

private class Circle(
    private val radius: Float,
) {
    fun perimeter(): Float {
        return PI * (radius + radius)
    }

    fun area(): Float {
        return PI * radius.toDouble().pow(2).toFloat()
    }
}