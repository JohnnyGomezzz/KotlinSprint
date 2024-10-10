package org.example.lesson4

fun main() {
    var dayOfTraining: Int
    var trainingArms = false
    var trainingLegs = false
    var trainingBack = false
    var trainingAbs = false
    var isEven: Boolean

    dayOfTraining = 5

    if (dayOfTraining % 2 == 0) {
        isEven = true
    } else {
        isEven = false
    }

    println(
        String.format(
            "День тренировок: %s\n" +
                    "Упражнения для рук:\t\t%s\n" +
                    "Упражнения для ног:\t\t%s\n" +
                    "Упражнения для спины:\t%s\n" +
                    "Упражнения для пресса:\t%s\n",
            dayOfTraining,
            trainingArms == isEven,
            trainingLegs == !isEven,
            trainingBack == !isEven,
            trainingAbs == isEven
        )
    )
}