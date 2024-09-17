fun isVowel(lettre:Char):Boolean{
    val voyelle = listOf('a','e','i','o','u')
    if (lettre in voyelle){
        return true
    }else {
        return false
    }
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
