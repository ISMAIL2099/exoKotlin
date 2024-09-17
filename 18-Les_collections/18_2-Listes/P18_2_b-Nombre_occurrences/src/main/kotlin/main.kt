fun main() {
    println(solution(listOf("Fred", "Pola", "Mike", "Fred"), "Fred"))
}

fun solution(strings: List<String>, str: String): Int {
    var res = 0
    for (i in strings.indices){
        if (strings[i]==str){
            res+=1
        }
    }
    return res
}
