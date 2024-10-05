package org.example.lesson1

/*
Перевод секунд в формат ЧЧ:ММ:СС
 */

const val TIME_UNITS = 60

fun main(){
    println("Введите количество секунд: ")
    val seconds = readlnOrNull()!!.toInt()

    val minutes = seconds / TIME_UNITS
    var hours = (minutes / TIME_UNITS).toString()
    var secondsRem = (seconds % TIME_UNITS).toString()
    var minutesRem = (minutes % TIME_UNITS).toString()

        if (hours.length == 1) {
        hours = "0$hours"
    }

    if (minutesRem.length == 1) {
        minutesRem = "0$minutesRem"
    }

    if (secondsRem.length == 1) {
        secondsRem = "0$secondsRem"
    }

    println("Время в формате ЧЧ:ММ:СС: $hours:$minutesRem:$secondsRem")

}