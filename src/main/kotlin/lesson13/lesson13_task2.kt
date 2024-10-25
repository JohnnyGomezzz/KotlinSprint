package org.example.lesson13

fun main() {
    val contact = PhoneBook2("Ростислав", 89123456789, "Reddit")
    val contact2 = PhoneBook2("Иннокентий", 89987654321)

    contact.getInfo()
    contact2.getInfo()
}

class PhoneBook2(
    _name: String,
    _phoneNumber: Long,
    val company: String? = null
) {
    val name = _name
    val phoneNumber = _phoneNumber

    fun getInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: ${company ?: "не указано"}"
        )
    }
}