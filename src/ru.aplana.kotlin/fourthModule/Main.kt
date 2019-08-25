package ru.aplana.kotlin.fourthModule

fun main() {
    //    val lada = DataClass("red", "vesta", 12345)
    //    println(lada.toString())

    //TODO(reason = Итоговое задание)
    val menu =
        arrayOf("Добавить самолёт", "Посмотреть все самолёты", "Выход из программы")
    var menuNumber = 1
    val airplanes = arrayListOf<Aircraft>()
    do {
        //Реализуем вывод меню.
        println("Есть список самолётов, что вы хотите с ним сделать?")
        for (menuItem in menu) {
            println("${menuNumber++}. $menuItem")
        }
        val choice = readLine()!!
        //Реализуем пользовательский ввод.
        when (choice) {
            "1" -> {
                println("Добавляйте самолёт.")
                //Реализуем добавление самолёта.
                println("Какой вы ходите добавить самолёт?")
                println("1. Пассажирский, 2. Грузовой.")
                val type = readLine()!!
                if (type == "1") {
                    airplanes.add(addBoing())
                }
                if (type == "2") {
                    airplanes.add(addAn2())
                }
                println()
                menuNumber = 1
            }
            "2" -> {
                //Реализуем просмотр всех самолётов
                println("Все самолёты:")
                if (airplanes.size == 0) {
                    println("Самолёты ещё не добавлены.")
                }
                for (airplane in airplanes) {
                    airplane.specifications()
                }
                println()
                menuNumber = 1
            }
        }
        //Реализуем выходи из программы.
    } while (choice != "3")
}

fun addBoing(): Aircraft {
    println("Добавляем пассажирский самолёт.")
    println("Введите дальности полёта:")
    val range = readLine()!!.toDouble()
    println("Введите максимальное количество топлива:")
    val fuel = readLine()!!.toDouble()
    println("Введите количество пассажиров:")
    val passengers = readLine()!!.toInt()
    return Boeing747(range, fuel, passengers)
}

fun addAn2(): Aircraft {
    println("Добавляем грузовой самолёт.")
    println("Введите дальности полёта:")
    val range = readLine()!!.toDouble()
    println("Введите максимальное количество топлива:")
    val fuel = readLine()!!.toDouble()
    println("Введите грузоподъёмность:")
    val cargo = readLine()!!.toInt()
    return An_2(range, fuel, cargo)
}