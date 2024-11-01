package org.example.lesson17

fun main() {

    val user = User("123", "1113r432")
    user.login = "222"
    println(user.login)

    user.password = "234124"
    println(user.password)
}

class User(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Успешная смена логина")
        }
    var password = _password
        set(value) = println("Вы не можете изменить пароль")
        get() {
            return field.replace(field, "*".repeat(field.length))
        }
}