fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var time: Int) {
    init {
        if(time<=-120){
            time=120

        }
        else if (time>= 127){
            time= -127
        }

    }

}
