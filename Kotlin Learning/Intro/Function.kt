fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    println(sum(2,3))
    println(mul(5,10))
    infixFunction()
    printAll("Arif", "Tarif", "Sharif")
}

//function example

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun mul(x: Int, y: Int) = x * y

//Infix function

fun infixFunction(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye")

    val pair = "Ferrari" to "Katrina" to "Dhaka"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLearn" onto "Lucas"
    println(myPair)

    val sophia = Person("sophia")
    val caludia = Person("caaudia")
    sophia likes caludia
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) } 
}

fun printAll(vararg message: String) {
    for (m in message) println(m)
}