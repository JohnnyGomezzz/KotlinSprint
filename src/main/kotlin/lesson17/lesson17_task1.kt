package org.example.lesson17

fun main() {

}

class Quiz(
    _question: String,
    _answer: String,
) {
    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}