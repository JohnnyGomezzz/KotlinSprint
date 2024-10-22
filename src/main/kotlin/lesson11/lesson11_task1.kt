package org.example.lesson11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val admin = User(
        id = 1,
        login = "VasyaTerminator",
        password = "De31n#r0",
        email = "admin@company.com",
    )

    val personalAssistant = User(
        id = 2,
        login = "Elvira",
        password = "12345",
        email = "elvira@company.com",
    )

    println(
        String.format(
            "%d\n%s\n%s\n%s",
            admin.id,
            admin.login,
            admin.password,
            admin.email,
        )
    )
    println(
        String.format(
            "%d\n%s\n%s\n%s",
            personalAssistant.id,
            personalAssistant.login,
            personalAssistant.password,
            personalAssistant.email,
        )
    )
}