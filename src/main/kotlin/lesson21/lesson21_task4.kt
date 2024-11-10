package org.example.lesson21

import java.io.File

fun main() {
    val textFileFor214: File = File("text_21-4.txt")
    val text = "TEXT "

    textFileFor214.appendText("3 ")
    textFileFor214.appendText("2 ")
    textFileFor214.appendText("5 ")

    textFileFor214.writeFirstLowercase(text)

}

fun File.writeFirstLowercase(someText: String) {
    this.writeText(someText.lowercase() + this.readText())
}