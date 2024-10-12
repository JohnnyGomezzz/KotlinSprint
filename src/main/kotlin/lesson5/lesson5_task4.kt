package org.example.lesson5

import kotlin.system.exitProcess

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    print("Приветствуем вас на борту корабля \"Heart of Gold\"!\nВведите, пожалуйста, логин и пароль.\nЛогин: ")
    val login = readln()

    if (login != USER_LOGIN) {
        println("Пользователя с таким именем не найдено.\nПожалуйста, зарегистрируйтесь.")
        exitProcess(1)
    } else {
        print("Пароль: ")
        val password = readln()

        if (password == USER_PASSWORD) {
            println("Привет, Президент! С возвращением!")
        } else {
            println("Неверный пароль. Пожалуйста, авторизуйтесь заново.")
        }
    }
}