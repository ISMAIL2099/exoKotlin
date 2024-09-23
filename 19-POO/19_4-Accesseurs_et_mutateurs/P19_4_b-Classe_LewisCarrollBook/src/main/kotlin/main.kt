class LewisCarrollBook(){
    var name:String = ""
    var author:String = ""
    var price :Int = 0
}


fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
}