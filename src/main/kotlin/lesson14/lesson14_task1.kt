package org.example.lesson14

fun main() {
    val liner = OceanLiner1("Королева Виктория", 25, 500, 1000, 3500)
    val icebreaker = Icebreaker("Ленин", 15, 35, 1000)
    val ferry = CargoShip("Волга-Енисей", 20, 10, 50000, "зерно")
}

open class OceanLiner1(
    val name: String,
    val speed: Int,
    val crew: Int,
    val capacity: Int,
    val numOfPassengers: Int = 0,
    val isBreakingIce: Boolean = false,
) {

}

class Icebreaker1(
    name: String,
    speed: Int,
    crew: Int,
    capacity: Int,
    ) : OceanLiner(name, speed, crew, capacity, isBreakingIce = true) {

}

class CargoShip1(
    name: String,
    speed: Int,
    crew: Int,
    capacity: Int,
    val cargoType: String,
) : OceanLiner(name, speed, crew, capacity) {

}