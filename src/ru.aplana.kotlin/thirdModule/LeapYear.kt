package ru.aplana.kotlin.thirdModule

/**
 * Задание 12.
 */
fun main() {
    println(leap(2016))
}

fun leap(year: Int): String {
    return if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
        "Обычный"
    } else {
        "Високосный"
    }
}