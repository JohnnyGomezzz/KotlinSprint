package org.example.lesson4

fun main() {
    print("Повреждён ли корабль? (true/false): ")
    val isDamaged = readln().toBoolean()

    print("Введите количество членов экипажа: ")
    val numberOfCrew = readln().toInt()

    print("Введите количество ящиков провизии на борту: ")
    val numberOfFoodCrates = readln().toInt()

    print("Благоприятны ли условия? (true/false): ")
    val isWeatherFine = readln().toBoolean()

    val isReadyForTrip =
        ((!isDamaged) && (numberOfCrew in 55..70) && (numberOfFoodCrates > 50) && isWeatherFine)
                || ((numberOfCrew == 70) && (numberOfFoodCrates >= 50) && isWeatherFine)

    println("Корабль готов отправиться в плавание: $isReadyForTrip")
}