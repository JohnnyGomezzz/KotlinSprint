package org.example.lesson12

import kotlin.random.Random

const val DAYS_IN_MONTH = 30
const val MIN_DAY_TEMPERATURE = 15
const val MAX_DAY_TEMPERATURE = 20
const val MIN_NIGHT_TEMPERATURE = 10
const val MAX_NIGHT_TEMPERATURE = 15

fun main() {
    val monthlyWeatherReport: MutableList<MonthWeather> = mutableListOf()
    var dayTemperature: Int
    var nightTemperature: Int
    var isRainfallDay: Boolean

    for (i in 1..DAYS_IN_MONTH) {
        dayTemperature = (MIN_DAY_TEMPERATURE..MAX_DAY_TEMPERATURE).random()
        nightTemperature = (MIN_NIGHT_TEMPERATURE..MAX_NIGHT_TEMPERATURE).random()
        isRainfallDay = Random.nextBoolean()
        monthlyWeatherReport.add(MonthWeather(dayTemperature, nightTemperature, isRainfallDay))
    }
    val monthlyDayTemperature = monthlyWeatherReport.map {
        it.dayTemperature
    }
    val monthlyNightTemperature = monthlyWeatherReport.map {
        it.nightTemperature
    }
    val monthlyRainyDays = monthlyWeatherReport.map {
        it.isRainfall
    }.filter {
        it
    }.size

    println(
        String.format(
            """ |Средняя дневная температура за месяц: %d
            |Средняя ночная температура за месяц: %d
            |Дней с осадками за месяц: %d
        """.trimMargin(),
            monthlyDayTemperature.average().toInt(),
            monthlyNightTemperature.average().toInt(),
            monthlyRainyDays
        )
    )
}

class MonthWeather(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isRainfall: Boolean,
) {
    val dayTemperature = _dayTemperature
    val nightTemperature = _nightTemperature
    val isRainfall = _isRainfall
}