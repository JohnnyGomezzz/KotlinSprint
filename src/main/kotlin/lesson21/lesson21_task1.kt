package org.example.lesson21

fun main() {
    val text = readln()

    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    return this.count { it in vowels }
}