package org.example.lesson20

fun main() {
    val listOfButtons: List<String> = listOf(
        "кнопка0",
        "кнопка1",
        "кнопка2",
        "кнопка3",
        "кнопка4",
        "кнопка5",
        "кнопка6",
        "кнопка7",
        "кнопка8",
        "кнопка9",
        "кнопка10",
    )

    val listOfPushedButtons = listOfButtons.map {
        if (listOfButtons.indexOf(it) % 2 == 0) { it: String -> println("Нажат элемент $it") }(it)
    }
}