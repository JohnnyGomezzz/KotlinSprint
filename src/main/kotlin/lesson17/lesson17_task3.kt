package org.example.lesson17

fun main() {
    val folder = Folder("Папка1", 5)

    folder.name
    folder.isSecret = true
    folder.name
}

private class Folder(
    _name: String,
    val numOfFiles: Int,
    var isSecret: Boolean = false,
) {
    val name = _name
        get() {
            if (isSecret) {
                println("Скрытая папка. Количество файлов - 0")
            } else println("$field. Количество файлов - $numOfFiles")
            return field
        }
}