package org.example.lesson12

const val CELSIUS_TO_KELVIN = 273

fun main() {
    val tuesdayWeather = KelvinWeather(290, 287, false)
    val saturdayWeather = KelvinWeather(295, 289, true)

    tuesdayWeather.showWeather()
    saturdayWeather.showWeather()
}

class KelvinWeather(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {
    val dayTemperature = _dayTemperature - CELSIUS_TO_KELVIN
    val nightTemperature = _nightTemperature - CELSIUS_TO_KELVIN
    val isRainfall: Boolean = _isRainfall

    fun showWeather() {
        println(
            "температура днём: $dayTemperature\n" +
                    "температура ночью: $nightTemperature\n" +
                    "наличие осадков: $isRainfall\n"
        )
    }
}