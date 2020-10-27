fun main() {
    //cases("Hello")
    //forLoop()
    //whileAndDoWhile()
    //rangeLoop()
    equalityCheck()
}

fun equalityCheck(){
    val authores = setOf("Shakespeare", "Hemingway", "Twain")
    val writters = setOf("Twain", "Shakespeare", "Hemingway")

    println(authores == writters)
    println(authores === writters)
}

fun forLoop() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, its a $cake cake!")
    }
}

fun rangeLoop() {

    val x = 2

    for (i in 0..3) {
        println(i)
    }

    for (i in 2..8 step 2) {
        println(i)
    }

    for (i in 3 downTo 0) {
        println(i)
    }

    for (c in 'a' .. 'd'){
        println(c)
    }

    for (c in 'z' downTo 's' step 2) {
        println(c)
    }

    if (x in 1..5) {
        println("x is in range from 1 to 5")
    }

    if (x !in 6..10) {
        println("x is not in range from 6..10")
    }
    
}

fun whileAndDoWhile() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++        
    }

    do {
        bakeACake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)
}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun cases(obj: Any) {
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}