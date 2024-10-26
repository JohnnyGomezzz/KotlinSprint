package org.example.lesson13

fun main() {
    val phoneList = mutableListOf<PhoneBook3>(
        PhoneBook3("Алёша", 89215678899),
        PhoneBook3("Иннокентий", 89217895544),
        PhoneBook3("Максим", 89056688994, "null"),
        PhoneBook3("Евангелина", 89118895544, "Вкусноточка"),
        PhoneBook3("Олег", 89056984774, "Лукойл"),
    )
    phoneList.mapNotNull { it.company }.forEach { println(it) }
}

class PhoneBook3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun getInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: ${company ?: "не указано"}"
        )
    }
}