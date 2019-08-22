fun main() {
    val country = Array(4, { Array(4, { "" }) })
    country[0] = arrayOf("Russia", "France", "Germany")
    country[1] = arrayOf("Moscow", "Paris", "Berlin")
    country[2] = arrayOf("Ruble", "Euro", "Euro")
    var o = 0

    do {
        println("${country[0][o]}\t${country[1][o]}\t${country[2][o]}")
        o++
    } while (o < country[0].size)
}