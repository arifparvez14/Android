fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   
    val natural = shuffled.sorted()
    println(natural)

    val inverted = shuffled.sortedBy { -it }
    println(inverted)

    val descending = shuffled.sortedDescending()
    println(descending)

}