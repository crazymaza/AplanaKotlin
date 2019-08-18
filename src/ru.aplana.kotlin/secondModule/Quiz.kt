fun main(args: Array<String>) {
    println("Мы сейчас начнём викторину.")
    println("Угадай что я загадал.")
    println("Это очень большое животное, которое живёт в африке.")
    var count = 0
    when (readLine()!!) {
        "Жираф" -> {
            println("Да, верно.")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Второй вопрос.")
    println("Это самый большой океан на Земле.")
    when (readLine()!!) {
        "Тихий" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Третий вопрос.")
    println("Это единственный спутник Земли.")
    when (readLine()!!) {
        "Луна" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Четвертый вопрос.")
    println("Российский фильм про четырёх бандитов 90-х.")
    when (readLine()!!) {
        "Бригада" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Четвертый вопрос.")
    println("Самая знаменитая кличка овчарки.")
    when (readLine()!!) {
        "Мухтар" -> {
            println("Верно!")
            count++
        }
        else -> println("Не угадал.")
    }
    println("Вы угадали $count вопросов.")
}