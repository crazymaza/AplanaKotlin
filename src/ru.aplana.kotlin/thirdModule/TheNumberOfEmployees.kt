package ru.aplana.kotlin.thirdModule

/**
 * Задание 13.
 */
fun main() {
    println(quantity("Сотрудник 1", "Сотрудник 2", "Сотрудник 3"))
}

fun quantity(vararg employees: String): Int {
    var count = 0
    for (employee in employees) {
        count++
    }
    return count
}