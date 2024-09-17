fun url(host: String="localhost", port: Int=443): String {
    val res = "https://$host:$port"
    return res
}

fun main() {
    println(url())
    println(url("192.168.1.1", 2626))
}