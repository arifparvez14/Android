//flatMap transforms each element of a collection into an iterable object and builds a single list of the transformation results

fun main() {
    val numbers = listOf(1, 2, 3)                   

    val tripled = numbers.flatMap { listOf(it, it) } 
    println(tripled)
}