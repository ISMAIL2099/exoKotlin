class Planet(){
    var star :String="Unkwon star"
    var mass :Double=1.0
    var numberOfSatellites: Int=1
}

fun main() {
    val kotlinPlanet = Planet()
    kotlinPlanet.star = "Java"
    kotlinPlanet.mass = 2.0
    kotlinPlanet.numberOfSatellites = 0
}