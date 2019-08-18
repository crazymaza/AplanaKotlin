fun main() {
    val country = Array(3, { Array(3, { "" }) })
    country[0] = arrayOf("Russia", "France", "Germany")
    country[1] = arrayOf("Moscow", "Paris", "Berlin")
    country[2] = arrayOf("Ruble", "Euro", "Euro")

    for (countryName in country) {
        print("$countryName\t")
        for (capital in countryName) {
            print("$capital\t")
        }
        println()
    }
}