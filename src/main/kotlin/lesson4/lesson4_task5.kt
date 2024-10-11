package org.example.lesson4

const val IS_DAMAGED = false
const val MIN_NUMBER_OF_CREW = 55
const val OPTIMAL_NUMBER_OF_CREW = 70
const val MIN_NUMBER_OF_FOOD_CRATES = 50
const val IS_WEATHER_FINE = true

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
        ((isDamaged == IS_DAMAGED) && (numberOfCrew in MIN_NUMBER_OF_CREW..OPTIMAL_NUMBER_OF_CREW) &&
                (numberOfFoodCrates > MIN_NUMBER_OF_FOOD_CRATES) && (isWeatherFine == IS_WEATHER_FINE)) ||

                ((numberOfCrew == OPTIMAL_NUMBER_OF_CREW) && (numberOfFoodCrates >= MIN_NUMBER_OF_FOOD_CRATES) &&
                        (isWeatherFine == IS_WEATHER_FINE))

    println("Корабль готов отправиться в плавание: $isReadyForTrip")
}