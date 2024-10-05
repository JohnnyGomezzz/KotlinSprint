package org.example.lesson1

/*
Перевод секунд в формат ЧЧ:ММ:СС
 */

const val TIME_UNITS = 60

fun main(){
    println("Введите количество секунд: ")
    val seconds = readlnOrNull()!!.toInt()

    val minutes = seconds / TIME_UNITS
    val hours = minutes / TIME_UNITS
    val secondsRem = seconds % TIME_UNITS
    val minutesRem = minutes % TIME_UNITS

    var hoursString = hours.toString()
    var minutesRemString = minutesRem.toString()
    var secondsRemString = secondsRem.toString()

        if (hours < 10) {
        hoursString = "0$hoursString"
    }

    if (minutesRem < 10) {
        minutesRemString = "0$minutesRemString"
    }

    if (secondsRem < 10) {
        secondsRemString = "0$secondsRemString"
    }

    println("Время в формате ЧЧ:ММ:СС: $hoursString:$minutesRemString:$secondsRemString")

}