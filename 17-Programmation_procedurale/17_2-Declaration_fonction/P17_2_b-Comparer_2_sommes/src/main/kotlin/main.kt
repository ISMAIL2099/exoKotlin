fun isGreater(nb1:Int,nb2:Int,nb3:Int,nb4:Int):Boolean{
    if (nb1+nb2<nb3+nb4){
        return true
    }else{
        return false
    }

}

fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}
