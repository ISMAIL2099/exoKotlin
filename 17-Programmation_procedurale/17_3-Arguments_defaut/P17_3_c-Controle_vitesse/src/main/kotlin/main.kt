fun checkSpeed(speed:Int,limite:Int=60):String {
    if (speed>limite){
        val exedent=speed-limite
        val res="exceeeds the limite by $exedent km/h "
        return res
    }else{
        val res="whithin the limit"
        return res
    }
}

fun main() {
    println(checkSpeed(100, 60))
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}