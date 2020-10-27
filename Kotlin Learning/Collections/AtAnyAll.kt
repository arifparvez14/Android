val numbers = listOf(1, -2, 3, -4, 5, -6)
fun main() {
    val anyNegative = numbers.any { it < 0}
    println(anyNegative)

    val anyGT6 = numbers.any {it > 6}
    println(anyGT6)

    val allEven = numbers.all { it % 2 == 0}
    println(allEven)

    val allLess6 = numbers.all { it < 6 } 
    println(allLess6)

    val allEvens = numbers.none { it % 2 == 1 } 
    println(allEvens)

    val allLess6s = numbers.none { it > 6 } 
    println(allLess6s)
}