package org.example.lesson17

fun main() {
    val ship = Ship("Мария", 30, "Санкт-Петербург")

    ship.name = "Виктория"
    println(ship.name)
}

class Ship(
    _name: String,
    val averageSpeed: Int,
    val homePort: String,
) {
    var name = _name
        set(value) = println("Корабль переименовать нельзя!")
}