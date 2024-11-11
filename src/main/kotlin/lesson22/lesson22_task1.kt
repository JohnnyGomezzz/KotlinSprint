package org.example.lesson22

fun main() {
    val regBook1 = RegularBook("Стихи", "Фет")
    val regBook2 = RegularBook("Стихи", "Фет")

    val dataBook1 = DataBook("Портрет", "Гоголь")
    val dataBook2 = DataBook("Портрет", "Гоголь")

    println(regBook1.equals(regBook2)) //сравнение ссылок на объекты
    println(dataBook1.equals(dataBook2)) //сравнение данных в объектах
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)