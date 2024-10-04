package org.example.lesson1
/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

fun main(){
    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60
    val secondsRem = seconds % 60
    val minutesRem = minutes % 60

    println("Время, проведенное в космосе Гагариным: 0$hours:$minutesRem:0$secondsRem")

}