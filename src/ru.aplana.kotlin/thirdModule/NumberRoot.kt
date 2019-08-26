package ru.aplana.kotlin.thirdModule

import kotlin.math.sqrt

/**
 * Задание 16
 */
fun main() {
    fun Int.root(): Int {
//        return sqrt(this.toDouble()).toInt()
        var t: Double
        var squareRoot = this / 2
        do {
            t = squareRoot.toDouble()
            squareRoot = ((t + this / t) / 2).toInt()
        } while (t - squareRoot != 0.0)
        return squareRoot
    }

    val double = 70
    println(double.root())
}