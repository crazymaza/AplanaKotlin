/*
    Пользователь вводит сумму вклада, длительность вклада(месяцы) и ежемесячный процент по вкладу.
    Программа выводит в консоль информацию на сколько будет увеличиваться вклад каждый месяц.
 */

fun main() {
    //Делаем 3 переменные: сумма вклада, длительность и проценты.
    println("Введите сумму кредита.")
    val sum: Int = readLine()!!.toInt()
    println("Введите период кредита.")
    val duration = readLine()!!.toInt()
    println("Введите проценты по кредиту.")
    val persent = readLine()!!.toInt()

    val incasePerMounth = sum * persent * 30 / 365 / 100
    val durationIncase = incasePerMounth * duration
    println("За месяц будете получать $incasePerMounth процентами.")
    println("За весь срок получите $durationIncase процентами.")
}