package org.example.lesson21

fun main() {
    val skillsPoints: Map<String, Int> = mapOf(
        "сила" to 10,
        "ловкость" to 25,
        "выносливость" to 25,
        "интеллект" to 10,
    )

    println(skillsPoints.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxBy { it.value }.key
}