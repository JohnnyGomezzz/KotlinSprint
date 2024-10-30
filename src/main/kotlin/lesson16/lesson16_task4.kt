package org.example.lesson16

fun main() {
    val order1 = Order(1)

    println(order1.isReady)
    order1.changeStatusResponse(true)
    println(order1.isReady)
}

private class Order(
    private val orderNumber: Int,
    var isReady: Boolean = false,
) {
    private fun changeStatus(newStatus: Boolean) {
        isReady = newStatus
    }

    fun changeStatusResponse(newStatus: Boolean) {
        changeStatus(newStatus)
    }
}