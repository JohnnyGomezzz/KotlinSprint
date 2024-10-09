package org.example.lesson4

fun main() {
    var dayOfTraining: Int
    var trainingArms: Boolean
    var trainingLegs: Boolean
    var trainingBack: Boolean
    var trainingAbs: Boolean

    dayOfTraining = 5

    if (dayOfTraining % 2 == 0) {
        trainingArms = false
        trainingLegs = true
        trainingBack = true
        trainingAbs = false
    } else {
        trainingArms = true
        trainingLegs = false
        trainingBack = false
        trainingAbs = true
    }

    println(
        String.format(
            "День тренировок: %s\n" +
                    "Упражнения для рук:\t\t%s\n" +
                    "Упражнения для ног:\t\t%s\n" +
                    "Упражнения для спины:\t%s\n" +
                    "Упражнения для пресса:\t%s\n",
            dayOfTraining,
            trainingArms,
            trainingLegs,
            trainingBack,
            trainingAbs
        )
    )
}