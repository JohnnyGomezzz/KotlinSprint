package org.example.lesson14

const val PI = 3.14f

fun main() {
    val figures = mutableListOf<Figure>(
        Circle("чёрный", 4.8f),
        Circle("белый", 3.5f),
        Rectangle("белый", 2.6f, 5.2f),
        Rectangle("чёрный", 3.7f, 1.4f)
    )
    println(String.format(
        "Сумма периметров чёрных фигур равна %.2f",
        figures.filter {
            it.color == "чёрный"
        }.sumOf {
            it.getPerimeter().toDouble()
        }
    )
    )
    println(String.format(
        "Сумма площадей белых фигур равна %.2f",
        figures.filter {
            it.color == "белый"
        }.sumOf {
            it.getArea().toDouble()
        }
    )
    )
}

abstract class Figure(
    val color: String,
) {
    abstract fun getArea(): Float

    abstract fun getPerimeter(): Float
}

class Circle(
    color: String,
    private val radius: Float,
) : Figure(color) {

    override fun getArea(): Float {
        return radius * radius * PI
    }

    override fun getPerimeter(): Float {
        return (radius + radius) * PI
    }
}

class Rectangle(
    color: String,
    private val width: Float,
    private val height: Float,
) : Figure(color) {

    override fun getArea(): Float {
        return width * height
    }

    override fun getPerimeter(): Float {
        return width + height + width + height
    }
}