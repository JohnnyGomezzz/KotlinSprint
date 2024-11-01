package org.example.lesson15

fun main() {

    val server = WeatherServer()
    server.addDataToList(Temperature())
    server.addDataToList(PrecipitationAmount())
    server.printData()
}

abstract class WeatherStationStats() {

    abstract fun execute()
}

class Temperature() : WeatherStationStats() {

    override fun execute() {
        println("Данные о средней дневной и ночной температуре")
    }
}

class PrecipitationAmount() : WeatherStationStats() {

    override fun execute() {
        println("Данные о среднесуточном количестве осадков")
    }
}

class WeatherServer {

    private val weatherDataList = mutableListOf<WeatherStationStats>()

    fun addDataToList(weatherData: WeatherStationStats) {
        weatherDataList.add(weatherData)
    }

    fun printData() {
        weatherDataList.forEach { it.execute() }
        weatherDataList.clear()
    }
}