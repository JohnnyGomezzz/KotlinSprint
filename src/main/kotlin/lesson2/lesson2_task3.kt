package org.example.lesson2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия
вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

const val TIME_UNITS = 60

fun main(){
    val departureHours = 9
    val departureMinutes = 39
    val totalDepartureMinutes = departureHours * TIME_UNITS + departureMinutes
    val travelTime = 457
    val totalTime = totalDepartureMinutes + travelTime

    var arrivalHours = ((totalTime / TIME_UNITS) % 24).toString()
    var arrivalMinutes = (totalTime % TIME_UNITS).toString()

    if (arrivalHours.length == 1) {
        arrivalHours = "0$arrivalHours"
    }

    if (arrivalMinutes.length == 1) {
        arrivalMinutes = "0$arrivalMinutes"
    }

    println("Время прибытия: $arrivalHours:$arrivalMinutes")
}