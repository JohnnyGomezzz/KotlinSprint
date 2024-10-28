package org.example.lesson11

fun main() {
    val newForum = Forum(
        forumId = 1,
        forumName = "Общение",
    )
    val member1 = newForum.createNewUser("Алёша")
    val member2 = newForum.createNewUser("Олег")

    val message1 = newForum.createNewMessage(member1.userId, "Сообщение 1")
    val message2 = newForum.createNewMessage(member2.userId, "Сообщение 2")
    val message3 = newForum.createNewMessage(member1.userId, "Сообщение 3")
    val message4 = newForum.createNewMessage(member2.userId, "Сообщение 4")

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
        for (member in members) {
            for (thread in threads) {
                if (member.userId == thread.authorId) {
                    println(
                        String.format(
                            "%s: %s",
                            member.userName,
                            thread.message
                        )
                    )
                }
            }
        }
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