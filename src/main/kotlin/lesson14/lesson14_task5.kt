package org.example.lesson14

fun main() {
    val chat = Chat(
        chatId = 1,
        chatName = "Болталка",
    )
    chat.addMessage("Алёша", "Привет!")
    chat.addThreadMessage(2, "Кристина", "И тебе привет!")
    chat.addMessage("Семён", "Всем привет из Питера!")
    chat.addThreadMessage(2, "Кристина", "Чем занимаешься?")
    chat.addThreadMessage(5, "Олег", "Я из Нижнего!")
    chat.addThreadMessage(2, "Алёша", "Я квадробер ^_^. А ты?")
    chat.addThreadMessage(2, "Кристина", "Фу, какая гадость...")

    chat.printChat()
}

class Chat(
    val chatId: Int,
    val chatName: String,
    var ids: Int = 0,
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(author: String, text: String) {
        messages.add(Message(getId(), author, text, getId()))
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        messages.add(ChildMessage(getId(), author, text, parentMessageId))
    }

    fun printChat() {
        val mapMessages = messages.groupBy { it.parentMessageId }
        for (mapMessage in mapMessages) {
            for (message in mapMessage.value) {
                println(
                    String.format(
                        "%d\t%s: %s",
                        message.messageId,
                        message.author,
                        message.text
                    )
                )
            }
        }
    }

    fun getId(): Int {
        ids++
        return ids
    }
}

open class Message(
    val messageId: Int,
    open val author: String,
    val text: String,
    val parentMessageId: Int,
)

class ChildMessage(
    messageId: Int,
    _author: String,
    text: String,
    parentMessageId: Int,
) : Message(messageId, _author, text, parentMessageId) {
    override val author = "\t" + _author
}