class City(val name: String) {
    var population: Int=0

    fun tooMuch(){
        if (population>50000000){
            population=50000000
        }
    }
    fun notEnough(){
        if (population<0){
            population=0
        }
    }
}

fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")

    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)
}