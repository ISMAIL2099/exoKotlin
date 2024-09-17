fun main() {
    solution(listOf(8, 11, 3, 2))
}

fun solution(numbers: List<Int>) {
    for(i in numbers.indices){
        if (numbers[i]%2==0){
            println(numbers[i])
        }
    }
}

