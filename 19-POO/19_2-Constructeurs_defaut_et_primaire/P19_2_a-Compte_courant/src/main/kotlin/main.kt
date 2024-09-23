class BankAccount(deposited:Int,withdrawn:Int){
    var balance = deposited-withdrawn
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}