fun main() {
    var number=1
    var suite = listOf(1,11,1,5,14,5,1,8,56,8,48,1)
    var cnt=0
    for (elem in suite){
        if (elem == number){
            cnt += 1
        }

    }

    println(cnt)
}
