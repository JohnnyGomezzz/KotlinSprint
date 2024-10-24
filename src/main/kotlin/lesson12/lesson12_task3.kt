package org.example.lesson12

fun main() {
    val tuesdayWeather = KelvinWeather(290, 287, false)
    val saturdayWeather = KelvinWeather(295, 289, true)

    tuesdayWeather.showWeather()
    saturdayWeather.showWeather()
}

class KelvinWeather(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {
    val dayTemperature = _dayTemperature - 273
    val nightTemperature = _nightTemperature - 273
    val isRainfall: Boolean = _isRainfall

    fun showWeather() {
        println(
            "температура днём: $dayTemperature\n" +
                    "температура ночью: $nightTemperature\n" +
                    "наличие осадков: $isRainfall\n"
        )
    }
}