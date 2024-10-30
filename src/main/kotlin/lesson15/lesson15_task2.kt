package org.example.lesson15

fun main() {
    val temperature = Temperature(WeatherServer())
    val precipitationAmount = PrecipitationAmount(WeatherServer())

    temperature.sendData()
    precipitationAmount.sendData()
}

abstract class WeatherStationStats() {

    abstract fun sendData()
}

class Temperature(
    val receiver: WeatherServer,
) : WeatherStationStats() {

    override fun sendData() {
        println("Данные о средней дневной и ночной температуре")
        receiver.dataToServer()
    }
}

class PrecipitationAmount(
    val receiver: WeatherServer,
) : WeatherStationStats() {

    override fun sendData() {
        println("Данные о среднесуточном количестве осадков")
        receiver.dataToServer()
    }
}

class WeatherServer() {

    fun dataToServer() {
        println("Передача данных на сервер")
    }
}