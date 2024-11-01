package org.example.lesson17

/*
Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Опиши класс посылки с такими вводными:

- свойства класса хранят: поле с номером посылки и поле с текущим местоположением;
- поле класса хранит счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика. При реализации
использовать сеттер.
 */

fun main() {

    val package1 = Package()

    package1.getInfo()
    package1.arrived("Нью-Васюки")
    package1.getInfo()

}

private class Package(
    var numOfPoints: Int = 1,
) {
    val packageNumber: Int = 1
    var currentLocationPoint: String = "Главпочтамт"
        set(value) {
            numOfPoints++
            field = value
        }

    fun arrived(locationPoint: String) {
        this.currentLocationPoint = locationPoint
    }

    fun getInfo() {
        println("Текущее местоположение: Пункт №${this.numOfPoints}, $currentLocationPoint")
    }
}