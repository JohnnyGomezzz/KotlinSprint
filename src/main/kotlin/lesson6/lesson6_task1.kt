package org.example.lesson6

fun main() {
    print(
        "Регистрация нового пользователя.\n" +
                "Придумайте логин: "
    )
    val userLogin = readln()

    print("Придумайте пароль: ")
    val userPassword = readln()

    println("Спасибо за регистрацию. Теперь вы можете войти в учётную запись.")

    do {
        print("Введите логин: ")
        val userLoginCheck = readln()

        if (userLoginCheck != userLogin) {
            println("Пользователя с таким логином не существует.")
        }
    } while (userLoginCheck != userLogin)

    do {
        print("Введите пароль: ")
        val userPasswordCheck = readln()

        if (userPasswordCheck != userPassword) {
            println("Пароль неверный.")
        }
    } while (userPasswordCheck != userPassword)

    println("Авторизация прошла успешно. Добро пожаловать, $userLogin!")

}