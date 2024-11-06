package org.example.lesson19

fun main() {
    println(
        """|Приложение "Картотека"
            
            |Для пополнения картотеки необходимо ввести имя человека и его/её пол.
            |Пол вводится следующим образом:
            |${PersonSex.entries[0]} - ${PersonSex.entries[0].translation}
            |${PersonSex.entries[1]} - ${PersonSex.entries[1].translation}""".trimMargin()
    )
    val app = XFilesApp()

    do {
        app.addPerson()
    } while (app.personList.size != 5)

    app.personList.forEach { it.getInfo() }
}

enum class PersonSex(val translation: String) {
    MALE("мужчина"),
    FEMALE("женщина"),
}

private class XFilesApp {
    val personList: MutableList<Person> = mutableListOf()
    var personNumber: Int = 1

    fun addPerson() {
        print(
            "\nКарточка №${personNumber}\n" +
                    "Введите имя: "
        )
        val name = readln()

        print("Введите пол: ")
        val sex = when (readln()) {
            "MALE" -> PersonSex.MALE
            "FEMALE" -> PersonSex.FEMALE
            else -> {
                println("Пол указан неверно. Карточка не записана")
                return
            }
        }
        val person = Person(personNumber, name, sex)
        personList.add(person)
        personNumber++
    }
}

private class Person(
    _personNumber: Int,
    _personName: String,
    _personSex: PersonSex,
) {
    val personNumber = _personNumber
    val personName = _personName
    val personSex = _personSex

    fun getInfo() {
        println(
            String.format(
                """|
                |Карточка №%d
                |имя: %s
                |пол: %s
            """.trimMargin(),
                personNumber,
                personName,
                personSex.translation
            )
        )
    }
}