package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val items = move.split("-", ";").toList()

    val from = items[0]
    val to = items[1]
    val moveCounter = items[2]

    println(
        String.format(
            """Ход игрока: %s
                |
                |Откуда: %s
                |Куда: %s
                |Номер хода: %s
            """.trimMargin(),
            move,
            from,
            to,
            moveCounter
        )
    )
}