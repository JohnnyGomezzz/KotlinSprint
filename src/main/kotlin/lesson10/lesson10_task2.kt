package org.example.lesson10

const val MIN_NUM_OF_SYM = 4

fun main() {
    println("Придумайте логин (не менее $MIN_NUM_OF_SYM символов): ")
    val userLogin = validText()

    println("Придумайте пароль (не менее $MIN_NUM_OF_SYM символов): ")
    val userPassword = validText()

    println(
        String.format(
            "Ваш логин: %s\n" +
                    "Ваш пароль: %s\n" +
                    "Добро пожаловать!",
            userLogin,
            userPassword
        )
    )
}

fun validText(): String {
    var text: String

    do {
        text = readln()
        if (text.length < MIN_NUM_OF_SYM) {
            println(
                "Недостаточно символов. Минимум - $MIN_NUM_OF_SYM\n" +
                        "Введите заново: "
            )
        }
    } while (text.length < MIN_NUM_OF_SYM)

    return text
}