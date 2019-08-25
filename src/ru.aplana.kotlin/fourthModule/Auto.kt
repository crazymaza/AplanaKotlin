package ru.aplana.kotlin.fourthModule

/**
 * Задание 23
 */
data class DataClass(val color: String, val model: String, val number: Int) {
    override fun toString(): String {
        return "Model: $model  Color: $color Number: $number"
    }
}
