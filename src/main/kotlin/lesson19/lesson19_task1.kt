package org.example.lesson19

fun main() {
    println("Вы можете добавить в аквариум рыбок:")
    for (i in Fish.entries) println(i)
}

enum class Fish(fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}