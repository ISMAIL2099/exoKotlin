fun main() {
    val numbers = mutableListOf(1,0,0,0,0,0,0,0,10)

    for (i in 11..100){
        if (i==100){
            numbers.add(100)
        }
        else{
            numbers.add(0)
        }
    }

        // do not touch the lines below
        println(numbers.joinToString())
}
