package org.example.lesson18

fun main() {
    val circle = Circle()
    val square = Square()
    val vertex = Vertex()

    println(
        circle.draw(23f, 234f) + "\n" +
                square.draw(18.65f, 2.4f) + "\n" +
                vertex.draw(346, 578)
    )
}

open class Screen(
    private val figureName: String,
) {
    open fun draw(xCoordinate: Float, yCoordinate: Float) = String.format(
        "Фигура %s нарисована в координатах x: %.2f; y: %.2f",
        figureName,
        xCoordinate,
        yCoordinate
    )

    open fun draw(xCoordinate: Int, yCoordinate: Int) = String.format(
        "Фигура %s нарисована в координатах x: %d; y: %d",
        figureName,
        xCoordinate,
        yCoordinate
    )
}

class Circle(
    figureName: String = "круг",
) : Screen(figureName)

class Square(
    figureName: String = "квадрат",
) : Screen(figureName)

class Vertex(
    figureName: String = "точка",
) : Screen(figureName)