package org.example.lesson15
/*
На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения. Администраторы дополнительно могут удалять сообщения
и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс. У абстрактного класса
должны быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль.
 */

fun main() {
    val member1 = Member(1, "Алёша")
    val admin = Admin(0, "Чжун Ли")

    member1.writeMessage()
    admin.createRoom("Беседка")
    member1.readMessage()
    admin.readMessage()
    admin.deleteMessage()
    admin.deleteMember(member1.name)
}

abstract class User(
    val id: Int,
    val name: String,
) {
    fun readMessage() {
        println("$name читает сообщение")
    }

    fun writeMessage() {
        println("$name пишет сообщение")
    }
}

abstract class SuperUser(
    id: Int,
    name: String
) : User(id, name) {

    fun createRoom(roomName: String) {
        println("$name создаёт комнату \"$roomName\"")
    }

    fun deleteMember(member: String) {
        println("$name удаляет пользователя $member")
    }

    fun deleteMessage() {
        println("$name удаляет сообщение")
    }
}

class Member(
    id: Int,
    name: String,
) : User(id, name)

class Admin(
    id: Int,
    name: String,
) : SuperUser(id, name)