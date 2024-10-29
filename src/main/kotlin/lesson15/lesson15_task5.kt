package org.example.lesson15

fun main() {
    val car1 = Car("Автомобиль1")
    val car2 = Car("Автомобиль2")
    val truck1 = Truck("Грузовик1")

    car1.startRoute()
    car2.startRoute()
    truck1.loadCargo(500)
    truck1.startRoute()
    car1.takePassengers(2)
    truck1.endRoute()
    truck1.loadCargo(1000)
    truck1.startRoute()
    car2.takePassengers(1)
    truck1.onRoute()
    car1.takePassengers(2)
    car1.takePassengers(1)
    truck1.endRoute()
    truck1.loadCargo(1000)
    truck1.loadCargo(500)
    truck1.startRoute()
    truck1.onRoute()
    car2.takePassengers(2)
    car1.onRoute()
    car2.onRoute()
    truck1.endRoute()
    truck1.unloadCargo(2000)
    car1.endRoute()
    car1.dropPassengers(3)
    car2.endRoute()
    car2.dropPassengers(3)
}

interface Movable {

    fun startRoute() {
        println(" начал движение")
    }

    fun onRoute() {
        println(" в пути")
    }

    fun endRoute() {
        println(" закончил движение")
    }
}

interface SuitableForPassengers {

    fun takePassengers(numOfPassengers: Int)

    fun dropPassengers(numOfPassengers: Int)
}

interface SuitableForCargo {

    fun loadCargo(quantity: Int)

    fun unloadCargo(quantity: Int)
}

abstract class Vehicle(
    val name: String,
    val maxNumOfPassengers: Int = 0,
    var currentNumOfPassengers: Int = 0,
    val maxQuantityOfCargo: Int = 0,
    var currentQuantityOfCargo: Int = 0,
)

class Truck(
    name: String,
    currentNumOfPassengers: Int = 0,
    currentQuantityOfCargo: Int = 0,
) : Vehicle(name, maxNumOfPassengers = 1, maxQuantityOfCargo = 2000), Movable, SuitableForCargo {

    override fun startRoute() {
        print(name)
        super.startRoute()
    }

    override fun onRoute() {
        print(name)
        super.onRoute()
    }

    override fun endRoute() {
        print(name)
        super.endRoute()
    }

    override fun loadCargo(quantity: Int) {
        if (quantity <= maxQuantityOfCargo - currentQuantityOfCargo) {
            println(
                "$name загрузил $quantity кг груза " +
                        "(всего ${currentQuantityOfCargo + quantity}/$maxQuantityOfCargo)"
            )
            currentQuantityOfCargo += quantity
        } else println(
            "Столько груза не поместится. " +
                    "Можно загрузить только ${maxQuantityOfCargo - currentQuantityOfCargo} кг груза"
        )
    }

    override fun unloadCargo(quantity: Int) {
        println("$name выгрузил $quantity кг груза")
        currentQuantityOfCargo = -quantity
    }
}

class Car(
    name: String,
    currentNumOfPassengers: Int = 0,
) : Vehicle(name, maxNumOfPassengers = 3), Movable, SuitableForPassengers {

    override fun startRoute() {
        print(name)
        super.startRoute()
    }

    override fun onRoute() {
        print(name)
        super.onRoute()
    }

    override fun endRoute() {
        print(name)
        super.endRoute()
    }

    override fun takePassengers(numOfPassengers: Int) {
        if (numOfPassengers <= maxNumOfPassengers - currentNumOfPassengers) {
            println(
                "$name подобрал $numOfPassengers пассажира " +
                        "(всего ${currentNumOfPassengers + numOfPassengers}/$maxNumOfPassengers)"
            )
            currentNumOfPassengers += numOfPassengers
        } else println(
            "Свободных мест нет. " +
                    "Можно подобрать только ${maxNumOfPassengers - currentNumOfPassengers} пассажира"
        )
    }

    override fun dropPassengers(numOfPassengers: Int) {
        println("$name высадил $numOfPassengers пассажира")
        currentNumOfPassengers = -numOfPassengers
    }
}