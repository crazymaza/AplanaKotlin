package ru.aplana.kotlin.fourthModule

/**
 *
 */
open class Aircraft(private val rangeOfFlight: Double, private val tankCapacity: Double) { //Задание 18
    val fuelConsumption
        get() = (tankCapacity / rangeOfFlight) * 100 // Задание 17
}