package ru.aplana.kotlin.fourthModule

class Boeing747(rangeOfFlight: Double, tankCapacity: Double, override val maxPassengers: Int) :
    Aircraft(rangeOfFlight, tankCapacity)/*Задание 19*/, Passenger /*Задание 20*/  {
    override fun specifications() { //Задание 22
        println("Тип: пассажирский, Дальность полёта: $rangeOfFlight км, Вместимость бака: $tankCapacity тонн, Кол-во пассажиров: $maxPassengers")
    }
}
