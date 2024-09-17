fun getVolume(largeur:Int=1,longueur:Int=1,hauteur:Int=1):Int{
    return largeur*longueur*hauteur
}

fun main() {
    println(getVolume(1))
}