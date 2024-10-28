package org.example.lesson15

fun main() {
    val member = Member(1, "Алёша")
    val admin = Admin(0, "Чжун Ли")

    member.writeMessage()
    member.readMessage()
    admin.readMessage()
    admin.deleteMessage()
    member.deleteMember("Чжун Ли")
    admin.deleteMember("Алёша")
}

abstract class User(
    val id: Int,
    val name: String,
    val isAdmin: Boolean = false,
) {
    fun readMessage() {
        println("$name читает сообщение")
    }

    fun writeMessage() {
        println("$name пишет сообщение")
    }

    fun deleteMember(member: String) {
        if (isAdmin) println("$name удаляет пользователя $member")
        else println("У вас нет прав на это действие")
    }

    fun deleteMessage() {
        if (isAdmin) println("$name удаляет сообщение")
        else println("У вас нет прав на это действие")
    }
}

class Member(
    id: Int,
    name: String,
) : User(id, name)

class Admin(
    id: Int,
    name: String,
) : User(id, name, isAdmin = true)