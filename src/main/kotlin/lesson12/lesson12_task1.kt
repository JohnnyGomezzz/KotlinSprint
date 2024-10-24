package org.example.lesson12

fun main() {
    val tuesdayWeather = Weather()
    val saturdayWeather = Weather()

    tuesdayWeather.dayTemperature = 20
    tuesdayWeather.nightTemperature = 15
    tuesdayWeather.isRainfall = true

    saturdayWeather.dayTemperature = 22
    saturdayWeather.nightTemperature = 15
    saturdayWeather.isRainfall = false

    tuesdayWeather.showWeather()
    saturdayWeather.showWeather()
}

class Weather {
    var dayTemperature = 0
    var nightTemperature = 0
    var isRainfall = false

    fun showWeather() {
        println("температура днём: $dayTemperature\n" +
                "температура ночью: $nightTemperature\n" +
                "наличие осадков: $isRainfall\n")
    }
}