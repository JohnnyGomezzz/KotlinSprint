package org.example.lesson13

fun main() {
    val phoneBook = PhoneBook5(
        phonebookName = "Деловые контакты",
    )
    phoneBook.createContact()

    phoneBook.getContacts()
}

class PhoneBook5(
    val phonebookName: String,
    val contactsList: MutableList<Contact5> = mutableListOf(),
) {
    fun createContact() {
        contactsList.add(
            Contact5(
                setContactName(),
                try {
                    setPhoneNumber()
                } catch (e: NumberFormatException) {
                    null
                } finally {
                    println("Здесь будет NumberFormatException")
                },
                setCompany()
            )
        )
    }

    fun getContacts() {
        println("Все контакты из телефонной книги \"$phonebookName\":")
        contactsList.forEach { it.getInfo() }
    }

    fun setContactName(): String {
        print("Введите имя контакта: ")
        return readln()
    }

    fun setPhoneNumber(): Long {
        print("Введите номер телефона: ")
        return readln().toLong()
    }

    fun setCompany(): String? {
        print("Введите название компании: ")
        val companyName = readln()
        if (companyName == "") return null
        return companyName
    }
}

class Contact5(
    var contactName: String,
    var phoneNumber: Long?,
    var company: String?,
) {
    init {
        println("Контакт $contactName создан.")
    }

    fun getInfo() {
        println(
            "- Имя: $contactName\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: ${company ?: "не указано"}\n"
        )
    }
}