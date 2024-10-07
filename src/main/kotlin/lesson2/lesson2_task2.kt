package org.example.lesson2

fun main() {
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