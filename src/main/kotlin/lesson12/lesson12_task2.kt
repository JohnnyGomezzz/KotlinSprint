package org.example.lesson12

fun main() {
    val tuesdayWeather = Weather2(
        dayTemperature = 25,
        nightTemperature = 19,
        isRainfall = true,
    )
    val saturdayWeather = Weather2(
        dayTemperature = 22,
        nightTemperature = 16,
        isRainfall = false,
    )

    tuesdayWeather.showWeather()
    saturdayWeather.showWeather()
}

class Weather2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRainfall: Boolean,
) {
    fun showWeather() {
        println(
            "температура днём: $dayTemperature\n" +
                    "температура ночью: $nightTemperature\n" +
                    "наличие осадков: $isRainfall\n"
        )
    }
}