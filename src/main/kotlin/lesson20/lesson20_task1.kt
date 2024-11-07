package org.example.lesson20

fun main() {

    val congratulations: (String) -> Unit = { username: String ->
        println("С наступающим Новым Годом, $username!")
    }
    congratulations("Алёша")
}