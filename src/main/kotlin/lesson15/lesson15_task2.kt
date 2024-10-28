package org.example.lesson15

fun main() {
    val stationServer = WeatherServer()

    val todayTemperature = Temperature(20, 15)
    val todayPrecipitationAmount = PrecipitationAmount(50)

    stationServer.sendDataToServer(
        stationServer.getPrecipitationAmountFromStation(
            todayPrecipitationAmount.dayPrecipitationAmount
        )
    )
    stationServer.sendDataToServer(
        stationServer.getTemperatureFromStation(
            todayTemperature.dayTemperature, todayTemperature.nightTemperature
        )
    )
}

abstract class WeatherStationStats(
    val dayTemperature: Int = 0,
    val nightTemperature: Int = 0,
    val dayPrecipitationAmount: Int = 0,
)

class Temperature(
    dayTemperature: Int,
    nightTemperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    dayPrecipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer(
    private val listOfWeatherData: MutableList<WeatherStationStats> = mutableListOf<WeatherStationStats>()
) {
    fun getTemperatureFromStation(dayTemperature: Int, nightTemperature: Int): String {
        listOfWeatherData.add(Temperature(dayTemperature, nightTemperature))
        return "Температура"
    }

    fun getPrecipitationAmountFromStation(dayPrecipitationAmount: Int): String {
        listOfWeatherData.add(PrecipitationAmount(dayPrecipitationAmount))
        return "Количество осадков"
    }

    fun sendDataToServer(dataType: String) {
        println("Данные отправлены: $dataType")
    }
}