package org.example.lesson3

fun main() {
    val userName = "Татьяна"
    val userSecondName = "Сергеевна"
    var userSurname = "Андреева"
    var userAge = 20

    println("$userSurname $userName $userSecondName, $userAge")

    userAge = 22
    userSurname = "Сидорова"

    println("$userSurname $userName $userSecondName, $userAge")
}