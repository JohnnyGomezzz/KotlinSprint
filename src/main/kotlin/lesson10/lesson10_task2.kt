package org.example.lesson10

const val MIN_NUM_OF_SYM = 4

fun main() {
    println("Придумайте логин (не менее $MIN_NUM_OF_SYM символов): ")
    val userLogin = readln()

    println("Придумайте пароль (не менее $MIN_NUM_OF_SYM символов): ")
    val userPassword = readln()

    if (validate(userLogin) && validate(userPassword)) {
        println(
            String.format(
                "Ваш логин: %s\n" +
                        "Ваш пароль: %s\n" +
                        "Добро пожаловать!",
                userLogin,
                userPassword
            )
        )
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validate(text: String): Boolean {
    if (text.length >= MIN_NUM_OF_SYM) return true
    return false
}