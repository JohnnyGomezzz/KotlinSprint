package org.example.lesson14

fun main() {
    val liner = OceanLiner("\"Королева Виктория\"", 25, 500, 1000, 3500)
    val icebreaker = Icebreaker("\"Ленин\"", 15, 35, 1000)
    val ferry = CargoShip("\"Волга-Енисей\"", 20, 10, 50000, "зерно")

    liner.getShipInfo()
    icebreaker.getShipInfo()
    ferry.getShipInfo()

    liner.shipLoadingStart()
    icebreaker.shipLoadingStart()
    ferry.shipLoadingStart()
}

open class OceanLiner(
    val name: String,
    val speed: Int,
    val crew: Int,
    val capacity: Int,
    val numOfPassengers: Int = 0,
    val isBreakingIce: Boolean = false,
) {
    open fun shipLoadingStart() {
        println("Трап выдвинут. Погрузка $name начата.")
    }

    open fun getShipInfo() {
        println(
            String.format(
                "Океанский лайнер %s:\n" +
                        "- скорость: %d узлов\n" +
                        "- кол-во членов экипажа: %d человек\n" +
                        "- грузоподъёмность: %d тонн\n" +
                        "- кол-во пассажиров: %d человек\n",
                name,
                speed,
                crew,
                capacity,
                numOfPassengers
            )
        )
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    crew: Int,
    capacity: Int,
) : OceanLiner(name, speed, crew, capacity, isBreakingIce = true) {

    override fun shipLoadingStart() {
        println("Кормовые ворота открыты.  Погрузка $name начата.")
    }

    override fun getShipInfo() {
        println(
            String.format(
                "Ледокол %s:\n" +
                        "- скорость: %d узлов\n" +
                        "- кол-во членов экипажа: %d человек\n" +
                        "- грузоподъёмность: %d тонн\n",
                name,
                speed,
                crew,
                capacity
            )
        )
    }

}

class CargoShip(
    name: String,
    speed: Int,
    crew: Int,
    capacity: Int,
    val cargoType: String,
) : OceanLiner(name, speed, crew, capacity) {

    override fun shipLoadingStart() {
        println("Погрузочный кран активирован.  Погрузка $name начата.")
    }

    override fun getShipInfo() {
        println(
            String.format(
                "Грузовое судно %s:\n" +
                        "- скорость: %d узлов\n" +
                        "- кол-во членов экипажа: %d человек\n" +
                        "- грузоподъёмность: %d тонн\n" +
                        "- тип груза: %s\n",
                name,
                speed,
                crew,
                capacity,
                cargoType
            )
        )
    }

}