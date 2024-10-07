package org.example.lesson2

const val TIME_UNITS = 60
const val DAY_HOURS = 24

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val totalDepartureMinutes = departureHours * TIME_UNITS + departureMinutes
    val travelTime = 457
    val totalTime = totalDepartureMinutes + travelTime

    var arrivalHours = ((totalTime / TIME_UNITS) % DAY_HOURS)
    var arrivalMinutes = (totalTime % TIME_UNITS)

    println(
        String.format(
            "Время прибытия: %02d:%02d",
            arrivalHours,
            arrivalMinutes
        )
    )
}