package ru.aplana.kotlin.firstModule

fun main(args: Array<String>) {

//TODO(reason = Задание 1, модуль 1)
    var any: Any? = null
    any = 4
    var bany = any / 2.5 //Double

//TODO(reason = Задание 2, модуль 1)
    val h = "hello"
    val ap = "Aplana"
    println("$h $ap")

//TODO(reason = Задание 3, модуль 1)
    val five = '5'
    five.toString()
    five.toByte()
    five.toShort()
    five.toInt()
    five.toDouble()
    five.toFloat()
    five.toLong()

//TODO(reason = Задание 4, модуль 1)
    println("Привет! Как тебя зовут?")
    val userName = readLine()!!
    println("Привет, $userName")

//TODO(reason = Задание 5, модуль 1)
    for (abc in 'z' downTo 'a') print(abc)
    println()

//TODO(reason = Задание 6, модуль 1)
    println("Введите первое число для сравнения:")
    val a = readLine()!!
    println("Введите второе число для сравнения:")
    val b = readLine()!!
    val isTrue = a > b
    println(isTrue)
}
