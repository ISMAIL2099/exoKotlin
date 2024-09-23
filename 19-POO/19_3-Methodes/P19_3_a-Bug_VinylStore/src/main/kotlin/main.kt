// fix it
class VinylStore(vinyl: String) {
    var a : String= vinyl
    fun printVinyl() {
        println(this.a)
    }
}

fun main() {
    val myStore = VinylStore("Vinyl Record")
    myStore.printVinyl()
}