package org.example.lesson2

const val TIME_UNITS = 60
const val DAY_HOURS = 24

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val totalDepartureMinutes = departureHours * TIME_UNITS + departureMinutes
    val travelTime = 457
    val totalTime = totalDepartureMinutes + travelTime

    var arrivalHours = ((totalTime / TIME_UNITS) % DAY_HOURS).toString()
    var arrivalMinutes = (totalTime % TIME_UNITS).toString()

    if (arrivalHours.length == 1) {
        arrivalHours = "0$arrivalHours"
    }

    if (arrivalMinutes.length == 1) {
        arrivalMinutes = "0$arrivalMinutes"
    }

    println(
        String.format(
            "Время прибытия: %s:%s",
            arrivalHours,
            arrivalMinutes
        )
    )
}