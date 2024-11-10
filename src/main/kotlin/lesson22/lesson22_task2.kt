package org.example.lesson22

fun main() {
    val regBook1 = RegularBook2("Стихи", "Фет")
    val dataBook1 = DataBook2("Портрет", "Гоголь")

    println(regBook1) // вывод строкового представления ссылки на объект
    println(dataBook1) // вывод названия класса и данных объекта
}

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)