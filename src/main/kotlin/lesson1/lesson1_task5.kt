package org.example.lesson1
/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

fun main(){
    val TIME_UNITS = 60
    val seconds = 6480
    val minutes = seconds / TIME_UNITS
    val hours = minutes / TIME_UNITS
    val secondsRem = seconds % TIME_UNITS
    val minutesRem = minutes % TIME_UNITS

    println("Время, проведенное в космосе Гагариным: 0$hours:$minutesRem:0$secondsRem")

}