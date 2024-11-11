package org.example.lesson22

fun main() {
    val cat = Cat("Мурзик", "серый", 9)
    val (name, color, age) = cat

    println("Имя: $name, цвет:$color, возраст:$age")
}

data class Cat(
    val name: String,
    val color: String,
    val age: Int,
)