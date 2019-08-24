package ru.aplana.kotlin.thirdModule

/**
 * Задание 14.
 */
fun main() {
    val employees = Array(4, { Array(4, { "" }) })
    employees[0] = arrayOf("ФИО", "21", "Главный главнюк", "Холост/женат")
    employees[1] = arrayOf("ИФО", "30", "Не главный главнюк", "Как-то сам по себе")
    employees[2] = arrayOf("ОИФ", "40", "Самый главный главнюк", "Давно женат")
    employees[3] = arrayOf("ФОИ", "27", "Главнюк", "В поиске любви")

    println(emplInfo("ФИО", "Главный главнюк", employees))
    println(emplInfo(employees, fio = "ИФО", age = "30", position = "Не главный главнюк"))
    println(emplInfo("ОИФ", "Давно женат", "Самый главный главнюк", employees))
    println(emplInfo("ФОИ", "27", "В поиске любви", "Главнюк", employees))
}

/**
 * ФИО и Должность
 */
fun emplInfo(
    fio: String,
    position: String,
    vararg employees: Array<Array<String>>
): String {
    for (emplArray in employees) {
        for (empl in emplArray) {
            if (fio.equals(empl[0]) && position.equals(empl[2])) {
                return "Имя: ${empl[0]}, Возраст: ${empl[1]}, Должность: ${empl[2]}, Статус: ${empl[3]}"
            }
        }
    }
    return "Нет такого сотрудника"
}

/**
 * ФИО, Возраст и Должность
 */
fun emplInfo(
    vararg employees: Array<Array<String>>,
    fio: String,
    age: String,
    position: String
): String {
    for (emplArray in employees) {
        for (empl in emplArray) {
            if (fio.equals(empl[0]) && position.equals(empl[2]) && age.equals(empl[1])) {
                return "Имя: ${empl[0]}, Возраст: ${empl[1]}, Должность: ${empl[2]}, Статус: ${empl[3]}"
            }
        }
    }
    return "Нет такого сотрудника"
}

/**
 * ФИО, Семейное положение и Должность
 */
fun emplInfo(
    fio: String,
    marStatus: String,
    position: String,
    vararg employees: Array<Array<String>>
): String {
    for (emplArray in employees) {
        for (empl in emplArray) {
            if (fio.equals(empl[0]) && position.equals(empl[2]) && marStatus.equals(empl[3])) {
                return "Имя: ${empl[0]}, Возраст: ${empl[1]}, Должность: ${empl[2]}, Статус: ${empl[3]}"
            }
        }
    }
    return "Нет такого сотрудника"
}

/**
 * ФИО, Возраст, Семейное положение и Должность
 */
fun emplInfo(
    fio: String,
    age: String,
    marStatus: String,
    position: String,
    vararg employees: Array<Array<String>>
): String {
    for (emplArray in employees) {
        for (empl in emplArray) {
            if (fio.equals(empl[0]) && position.equals(empl[2]) && marStatus.equals(empl[3]) && age.equals(empl[1])) {
                return "Имя: ${empl[0]}, Возраст: ${empl[1]}, Должность: ${empl[2]}, Статус: ${empl[3]}"
            }
        }
    }
    return "Нет такого сотрудника"
}