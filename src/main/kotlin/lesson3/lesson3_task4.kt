package org.example.lesson3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveCounter = 1

    println("[$from-$to;$moveCounter]")

    moveCounter++
    from = "D2"
    to = "D3"
    println("[$from-$to;$moveCounter]")
}