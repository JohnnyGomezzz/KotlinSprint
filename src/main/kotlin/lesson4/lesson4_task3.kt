package org.example.lesson4

const val IS_SUNNY = true
const val TENT_IS_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val isSunny = true
    val tentIsOpen = true
    val airHumidity = 20
    val season = "зима"

    val checkPossibilityForBeans =
        (isSunny == IS_SUNNY) && (tentIsOpen == TENT_IS_OPEN) && (airHumidity == AIR_HUMIDITY) && (season != SEASON)

    println(
        "Благоприятные ли условия сейчас для роста бобовых? $checkPossibilityForBeans"
    )
}