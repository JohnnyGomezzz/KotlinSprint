package org.example.lesson8

fun main() {
    val views = intArrayOf(105, 200, 157, 125, 288, 346, 322)

    var totalViews = 0

    for (i in views.indices) {
        totalViews += views[i]
    }
    println("Всего просмотров за неделю: $totalViews")
}