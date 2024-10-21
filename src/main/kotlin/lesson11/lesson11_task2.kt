package org.example.lesson11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun getUserInfo() {
        println(
            String.format(
                "%d\n%s\n%s\n%s",
                id,
                login,
                password,
                email,
                bio,
            )
        )
    }

    fun addBio() {
        println("Введите информацию о себе: ")
        bio = readln()
    }

    fun changePassword() {
        while (true) {
            print("Введите текущий пароль: ")
            val currentPassword = readln()

            if (currentPassword == password) break
            else println("Пароль неверный")
        }
        print("Введите новый пароль: ")
        val newPassword = readln()

        password = newPassword
        println("Пароль изменён")
    }
}

fun main() {
    val boss = User2(
        id = 666,
        login = "theking",
        password = "petrov",
        email = "seo@company.com",
    )

    boss.addBio()
    boss.changePassword()
    boss.getUserInfo()
}