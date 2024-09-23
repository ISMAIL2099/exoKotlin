class Car(val make: String, val year: Int) {

    var speed: Int = 0

    fun accelerate():Int{
        return speed + 5
    }
    fun decelerate():Int{
        if (speed<0){
            speed=0
            return speed
        }
        else{
            return speed + 5
        }
    }
}

fun main() {
    val myCar = Car("Mustang", 1976)
    myCar.accelerate()
    println(myCar.speed)
    myCar.decelerate()
    myCar.decelerate()
    println(myCar.speed)
}