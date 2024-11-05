package org.example.lesson18

fun main() {
    val pet1 = Fox("Лися")
    val pet2 = Cat("Кися")
    val pet3 = Dog("Алёша")

    val tamagochi: List<ImaginaryPet> = listOf(pet1, pet2, pet3)

    tamagochi.forEach {
        println(it.eat())
        println(it.sleep())
        println(it.poop())
    }
}

open class ImaginaryPet(
    private val name: String,
    private val food: String = "",
) {
    open fun eat() = "$name -> кушает $food"
    open fun sleep() = "$name -> спит"
    open fun poop() = "$name -> какает"
}

class Fox(
    name: String,
) : ImaginaryPet(name, food = "ягоды")

class Cat(
    name: String,
) : ImaginaryPet(name, food = "рыбу")

class Dog(
    name: String,
) : ImaginaryPet(name, food = "кости")