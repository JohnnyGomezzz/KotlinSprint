package org.example.lesson2

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили
зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */

fun main(){
    val numberOfCurrentEmployees = 50
    val eachEmployeeSalary = 30000
    val numberOfInterns = 30
    val eachInternSalary = 20000

    val allCurrentEmployeesSalary = numberOfCurrentEmployees * eachEmployeeSalary
    val allInternsSalary = numberOfInterns * eachInternSalary
    val totalSalaryOfAllEmployees = allInternsSalary + allCurrentEmployeesSalary
    val totalNumberOfEmployees = numberOfCurrentEmployees + numberOfInterns
    val averageSalaryOfAllEmployees = totalSalaryOfAllEmployees / totalNumberOfEmployees

    println("Расходы на выплату зарплаты постоянных сотрудников: $allCurrentEmployeesSalary")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryOfAllEmployees")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryOfAllEmployees")
}