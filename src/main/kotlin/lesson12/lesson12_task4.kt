package org.example.lesson12

fun main() {
    val tuesdayWeather = KelvinWeather2(290, 287, false)
    val saturdayWeather = KelvinWeather2(295, 289, true)
}

class KelvinWeather2(_dayTemperature: Int, _nightTemperature: Int, _isRainfall: Boolean) {
    val dayTemperature = _dayTemperature - 273
    val nightTemperature = _nightTemperature - 273
    val isRainfall: Boolean = _isRainfall

    init {
        println(
            "температура днём: $dayTemperature\n" +
                    "температура ночью: $nightTemperature\n" +
                    "наличие осадков: $isRainfall\n"
        )
    }
}