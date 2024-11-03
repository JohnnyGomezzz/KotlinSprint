package org.example.lesson18

fun main() {
    val order1 = Order("сахар")
    val order2 = Order(listOf("молоко", "кефир"))

    order1.getInfo(order1.product)
    order2.getInfo(order2.products)
}

private class Order {

    var orderNumber: Int = 1
    var product: String = ""
    var products: List<String> = listOf()

    constructor(
        _product: String,
    ) {
        this.product = _product
    }

    constructor(
        _products: List<String>,
    ) {
        this.products = _products
    }

    init {
        orderNumber++
    }

    fun getInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun getInfo(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString()}")
    }
}