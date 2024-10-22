package org.example.lesson11

class Room(
    val roomId: Int,
    val roomName: String,
    val background: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun changeParticipantStatus(name: String, statusIndex: Int) {
        val statusList = listOf("разговаривает", "микрофон выключен", "заглушен")

        for (participant in participants) {
            if (participant.participantName == name) {
                participant.status = statusList[statusIndex]
            }
        }
    }
}

class Participant(
    val participantId: Int,
    val participantName: String,
    val avatar: String,
    var status: String = "заглушен",
)

fun main() {
    val conversationRoom = Room(
        roomId = 1,
        roomName = "Общение",
        background = "company.com/pix/bgr1.jpg",
    )
    val talker = Participant(
        participantId = 1,
        participantName = "Алёша",
        avatar = "company.com/pix/ava1.jpg"
    )
    conversationRoom.addParticipant(talker)
    conversationRoom.changeParticipantStatus("Алёша", 1)

    println(conversationRoom.participants[0].status)
}