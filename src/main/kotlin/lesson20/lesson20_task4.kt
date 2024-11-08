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
        { element: String -> "Нажат элемент $element" }(it)
    }

    for (i in listOfPushedButtons.indices) {
        if (i % 2 == 0) println(listOfPushedButtons[i])
    }
}