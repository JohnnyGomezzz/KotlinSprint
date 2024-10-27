package org.example.lesson13

fun main() {
    val phoneBook = PhoneBook4(
        phonebookName = "Деловые контакты",
    )
    phoneBook.createContact()
    phoneBook.createContact()
    phoneBook.createContact()

    phoneBook.getContacts()
}

class PhoneBook4(
    val phonebookName: String,
    val contactsList: MutableList<Contact> = mutableListOf(),
) {
    fun createContact() {
        contactsList.add(
            Contact(
                setContactName(),
                setPhoneNumber().also {
                    if (it == null) {
                        println("Не является номером телефона. Контакт не создан.")
                        return
                    }
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

    fun setPhoneNumber(): Long? {
        print("Введите номер телефона: ")
        return readln().toLongOrNull()
    }

    fun setCompany(): String? {
        print("Введите название компании: ")
        val companyName = readln()
        if (companyName == "") return null
        return companyName
    }
}

class Contact(
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