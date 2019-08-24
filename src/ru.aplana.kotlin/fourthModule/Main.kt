package ru.aplana.kotlin.fourthModule

fun main() {
    val aircraft = Aircraft(150.3, 34.4)
    println(aircraft.fuelConsumption)

    val aircraft1 = Boeing747(123.3, 123.34, 34)
    println(aircraft1.fuelConsumption)
}