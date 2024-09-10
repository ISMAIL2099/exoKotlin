fun main() {
    val mot ="skibidi"
    var res=""
    for (i in 'a'..'z'){
        if (i in mot){
            continue
        }
        res+=i
    }
    println(res)
}
