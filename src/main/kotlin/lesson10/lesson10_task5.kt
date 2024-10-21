package org.example.lesson10

const val USER_LOGIN = "login"
const val USER_PASSWORD = "password"
const val USER_CART = "Ваша корзина, определённо наполненная нужными товарами"
const val LENGTH_OF_TOKEN = 32

fun main() {
    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    authorize(userLogin, userPassword)?.let { getCart() }
}

fun authorize(userLogin: String, userPassword: String): String? {
    if (userLogin == USER_LOGIN && userPassword == USER_PASSWORD) return getToken()
    else println("Логин или пароль неверные. Авторизация не удалась.")
    return null
}

fun getToken(): String {
    val token = mutableListOf<String>()
    val number = 0..9
    val letter = 'a'..'z'

    for (i in 1..LENGTH_OF_TOKEN) {
        if (i % 2 == 0) token.add(number.random().toString())
        else token.add(letter.random().toString())
    }
    return token.shuffled().joinToString("")
}

fun getCart() {
    println(USER_CART)
}