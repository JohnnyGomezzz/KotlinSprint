package org.example.lesson22

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main() {
    val alfaCentauri = GalacticGuide(
        "Альфа Центавра", "Тройная звёздная система в созвездии Центавра",
        LocalDateTime.of(
            LocalDate.of(2024, 11, 10), LocalTime.of(15, 56)
        ),
        4.36f
    )
    val (name, info, date, distance) = alfaCentauri

    println(
        String.format(
            "Информация об объекте:\n" +
                    "Название: %s\n" +
                    "Описание: %s\n" +
                    "Дата и время: %s\n" +
                    "Расстояние от Земли: %.2f св. лет",
            name,
            info,
            date.toString(),
            distance
        )
    )
}

data class GalacticGuide(
    val name: String,
    val info: String,
    val date: LocalDateTime,
    val distance: Float,
)