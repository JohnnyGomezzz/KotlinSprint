package org.example.lesson15

fun main() {
    val guitar = Instrument("Гитара", 10)
    val strings = Accessory("Струны", 15)

    guitar.getQuantityInStorage()
    strings.getQuantityInStorage()

    guitar.searchAccessory("Струны")
}

interface Searchable {

    fun searchAccessory(name: String) {
        println("Выполняется поиск: $name")
    }
}

abstract class Goods(
    val name: String,
    val quantity: Int,
    val storage: MutableList<Goods> = mutableListOf<Goods>()
) {
    fun getQuantityInStorage() {
        storage.forEach {
            if (it.name == name) {
                println("$name. На складе: ${it.quantity} шт.")
            }
        }
    }

    fun incoming(quantity: Int) {

    }

    fun outgoing(quantity: Int) {

    }
}

class Instrument(
    name: String,
    quantity: Int,
) : Goods(name, quantity), Searchable {

    init {
        storage.add(this)
    }
}

class Accessory(
    name: String,
    quantity: Int,
) : Goods(name, quantity) {

    init {
        storage.add(this)
    }
}