package ru.aplana.kotlin.secondModule

fun main() {
    /*
    Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
    - Добавить название города в программу.
    - Посмотреть в консоли список всех добавленных городов
    - Посмотреть список добавленных городов без повторений
    - Выход из программы
    Для хранения используйте коллекцию типа List.
     */
    val menu =
        arrayOf("Добавить город", "Посмотреть все города", "Посмотреть список без повторений", "Выход из программы")
    var menuNumber = 1
    val cities = arrayListOf<String>()
    do {
        //Реализуем вывод меню.
        println("Есть список городов, что вы хотите с ним сделать?")
        for (menuItem in menu) {
            println("${menuNumber++}. $menuItem")
        }
        val choice = readLine()!!
        //Реализуем пользовательский ввод.
        when (choice) {
            "1" -> {
                println("Добавляйте город.")
                //Реализуем добавление города.
                cities.add(readLine()!!)
                println()
                menuNumber = 1
            }
            "2" -> {
                //Реализуем просмотр всех городов
                println("Все города:")
                for (city in cities) {
                    print("$city\t")
                }
                menuNumber = 1
            }
            "3" -> {
                //Реализуем просмотр без повторений. LinkedHashSet
                println("Все города без повторений:")
                val noRepetition = linkedSetOf<String>()
                noRepetition.addAll(cities)
                for (noRep in noRepetition) {
                    print("$noRep\t")
                }
                menuNumber = 1
            }
        }
    //Реализуем выходи из программы.
    } while (choice != "4")
}