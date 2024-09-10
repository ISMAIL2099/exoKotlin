fun main() {
    var liste = listOf(1,2,3,5,4,6,8,4,5,6,7,8,5,4,3,4,5)
    var triples = 0
    for (i in liste) {
        if (liste[i] + 1 == liste[i+1] && liste[i+2] == liste[i] + 2){
            triples += 1
        }
    }
    println(triples)
}

