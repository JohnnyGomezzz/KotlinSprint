package org.example.lesson21

fun main() {
    val text = readln()

    println(text.vowelCount())
}

fun String.vowelCount(): Int {
    var count = 0
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    for (i in this.lowercase()) {
        if (i in vowels) count++
    }
    return count
}