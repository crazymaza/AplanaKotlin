package ru.aplana.kotlin.fourthModule

abstract class Aircraft(protected val rangeOfFlight: Double, protected val tankCapacity: Double) { //Задание 18, Задание 21
    val fuelConsumption
        get() = (tankCapacity / rangeOfFlight) * 100 // Задание 17

    open fun specifications() { //был protected, но для финального задания вернул public
        println("Дальность полёта: $rangeOfFlight км, Вместимость бака: $tankCapacity тонн")
    }
}