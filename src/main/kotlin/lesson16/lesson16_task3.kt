package org.example.lesson16

fun main() {
    val user = User("Алёша", "1234")

    println(user.isPasswordValid("1234"))
    println(user.isPasswordValid("12345"))
}

private class User(
    val login: String,
    private val password: String,
) {
    fun isPasswordValid(checkPassword: String): Boolean {
        return checkPassword == password
    }
}