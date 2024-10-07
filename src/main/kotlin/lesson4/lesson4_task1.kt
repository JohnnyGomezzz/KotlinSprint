package org.example.lesson4

const val ALL_TABLES = 13

fun main() {
    val reservedToday = 13
    val reservedTomorrow = 9

    val isAvailableToday = reservedToday < ALL_TABLES
    val isAvailableTomorrow = reservedTomorrow < ALL_TABLES

    println(
        "Доступность столиков на сегодня: $isAvailableToday,\n" +
        "Доступность столиков на завтра: $isAvailableTomorrow."
    )
}