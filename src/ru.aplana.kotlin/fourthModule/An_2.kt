package ru.aplana.kotlin.fourthModule

class An_2(rangeOfFlight: Double, tankCapacity: Double, override val carryingCapacity: Int) : Aircraft(rangeOfFlight, tankCapacity),CargoAirplane {
    override fun specifications() { //Задание 22
        println("Тип: грузовой, Дальность полёта: $rangeOfFlight км, Вместимость бака: $tankCapacity тонн, Грузоподъёмность: $carryingCapacity")
    }
}