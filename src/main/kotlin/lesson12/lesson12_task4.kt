package org.example.lesson12

const val CELSIUS_KELVIN = 273

fun main() {
    val tuesdayWeather = KelvinWeather2(290, 287, false)
    val saturdayWeather = KelvinWeather2(295, 289, true)
}

class KelvinWeather2(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {
    val dayTemperature = _dayTemperature - CELSIUS_KELVIN
    val nightTemperature = _nightTemperature - CELSIUS_KELVIN
    val isRainfall: Boolean = _isRainfall

    init {
        println(
            "температура днём: $dayTemperature\n" +
                    "температура ночью: $nightTemperature\n" +
                    "наличие осадков: $isRainfall\n"
        )
    }
}