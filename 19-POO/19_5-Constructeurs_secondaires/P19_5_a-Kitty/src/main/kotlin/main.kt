class Kitty {
    constructor(couleur:String,age:Int)
    constructor(age:Int,couleur:String)
    constructor(couleur:String)
    constructor(age:Int)
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}