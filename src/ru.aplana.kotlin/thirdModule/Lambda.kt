package ru.aplana.kotlin.thirdModule

/**
 * Задание 15.
 */
fun main() {
    val array = arrayOf("first", "second")

    val arrayItems = { arr: Array<String> ->
        for (elem in arr) {
            println(elem)
        }
    }

    arrayItems(array)
}