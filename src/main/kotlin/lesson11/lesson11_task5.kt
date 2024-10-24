package org.example.lesson11

/*
Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей “Член форума”
(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Строитель” для создания пользователей и сообщений форума. Напрямую объекты не создаются, логика
должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя в
общий список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой пользователь
есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого
пользователя.
 */

fun main() {
    val newForum = Forum(
        forumId = 1,
        forumName = "Общение",
    )
    val member1 = newForum.createNewUser("Алёша")
    println(member1)
    println(newForum.members.toString())

    val text = "сообщение 1"
    val message1 = newForum.createNewMessage(member1.userId, text)

    newForum.printThread()
}

class Forum(
    private val forumId: Int,
    private val forumName: String,
    val members: MutableSet<Member> = mutableSetOf(),
    private val threads: MutableList<Thread> = mutableListOf(),
) {
    fun createNewUser(name: String): Member {
        val user = MemberBuilder().apply {
            setUserName(name)
            setUserId()
        }.build()
        members.add(user)
        return user
    }

    fun createNewMessage(userId: Int, message: String): Thread {
        val thread = ThreadBuilder().apply {
            setAuthor(userId)
            writeMessage(message)
        }.build()
        threads.add(thread)
        return thread
    }

    fun printThread() {
//        val author: String
//        val message: String
//
//        if (threads.forEach { it.authorId } == members.forEach { it.userId }) {
//            author = members.forEach { it.userName }.toString()
//            message = threads.forEach { it.message }.toString()
//            println("$author: $message")
//        }
    }

    fun check(userId: Int) {

    }
}

data class Member(
    val userId: Int,
    val userName: String,
)

class MemberBuilder {
    private var userId: Int = 0
    private var userName: String = ""

    fun setUserName(userName: String) = apply { this.userName = userName }
    fun setUserId() = apply {
        this.userId = (1..1000).random()
    }

    fun build() = Member(userId, userName)
}

data class Thread(
    val authorId: Int,
    val message: String,
)

class ThreadBuilder {
    private var authorId: Int = 0
    private var message: String = ""

    fun setAuthor(userId: Int) = apply { this.authorId = userId }
    fun writeMessage(message: String) = apply { this.message = message }

    fun build() = Thread(authorId, message)
}