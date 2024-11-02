package org.example.lesson15

fun main() {

    val server = WeatherServer()
    server.sendData(Temperature())
    server.sendData(PrecipitationAmount())
}

abstract class WeatherStationStats()

class Temperature() : WeatherStationStats()

class PrecipitationAmount() : WeatherStationStats()

class WeatherServer {

    fun sendData(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Данные о средней дневной и ночной температуре")
            is PrecipitationAmount -> println("Данные о среднесуточном количестве осадков")
        }
    }
}