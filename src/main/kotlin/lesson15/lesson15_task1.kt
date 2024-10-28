package org.example.lesson15

fun main() {
    val waterBird1 = WaterBird("Утка")
    val waterBird2 = WaterBird("Чайка")
    val fish1 = Fish("Карась")

    waterBird1.flyUp()
    waterBird2.flyUp()
    waterBird1.toLand()
    waterBird2.splashdown()
    waterBird2.swimOnWater()
    fish1.swimUnderWater()
}

interface Flyable {

    fun flyUp() {
        println("взлетает")
    }

    fun toLand() {
        println("приземляется")
    }
}

interface Swimmable {

    fun swimUnderWater() {
        println("плавает под водой")
    }

    fun swimOnWater() {
        println("плавает по воде")
    }

    fun splashdown() {
        println("приводняется")
    }
}

class WaterBird(
    val name: String,
) : Swimmable, Flyable {

    override fun flyUp() {
        println("$name взлетает")
    }

    override fun toLand() {
        println("$name приземляется")
    }

    override fun splashdown() {
        println("$name приводняется")
    }

    override fun swimOnWater() {
        println("$name плавает по воде")
    }
}

class Fish(
    val name: String,
) : Swimmable {

    override fun swimUnderWater() {
        println("$name плавает под водой")
    }
}