fun main(args: Array<String>) {
    println("Мы сейчас начнём викторину.")
    println("Угадай что я загадал.")
    println("Это очень большое животное, которое живёт в африке.")
    println("1. Жираф, 2. Леопард, 3. Сурикат.")
    var count = 0
    when (readLine()!!) {
        "1" -> {
            println("Да, верно.")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Второй вопрос.")
    println("Это самый большой океан на Земле.")
    println("1. Индийский, 2. Тихий, 3. Атлантический")
    when (readLine()!!) {
        "2" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Третий вопрос.")
    println("Это единственный спутник Земли.")
    println("1. Плутон, 2. Уран, 3. Луна.")
    when (readLine()!!) {
        "3" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Четвертый вопрос.")
    println("Российский фильм про четырёх бандитов 90-х.")
    println("1.Тригада, 2. Бригада, 3.Тригада и собака.")
    when (readLine()!!) {
        "2" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Пятый вопрос.")
    println("Самая знаменитая кличка овчарки.")
    println("1. Лесси, 2. Несси, 3. Мухтар.")
    when (readLine()!!) {
        "3" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Вы угадали $count вопрос(а).")
}