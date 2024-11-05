package org.example.lesson18

fun main() {
    val box1 = ClassicBox(200, 300, 400)
    val box2 = QubeBox(150)
    val box3 = BottleBox(100, 350)

    println(box1.getArea())
    println(box2.getArea())
    println(box3.getArea())
}

open class Box(
    private val width: Int,
    private val height: Int,
    private val depth: Int,
) {
    open fun getArea() = 2 * (width * height + height * depth + width * depth)
}

class ClassicBox(
    width: Int,
    height: Int,
    depth: Int,
) : Box(width, height, depth)

class QubeBox(
    width: Int,
) : Box(width, height = width, depth = width)

class BottleBox(
    width: Int,
    height: Int,
) : Box(width, height, depth = width)