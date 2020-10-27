val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
val word = listOf("foo", "bar", "baz", "faz") 

val numbers = listOf(1, -2, 3, -4, 5, -6)   
val empty = emptyList<String>() 

fun main() {
    val first = words.find {it.startsWith("some")}
    println(first)

    val last = words.findLast { it.startsWith("some") } 
    println(last)

    val nothing = words.find { it.contains("nothing") }    
    println(nothing)

    val firstNum = numbers.first()
    println(firstNum )

    val lastNum = numbers.last() 
    println(lastNum)

    val firstEven = numbers.first { it % 2 == 0 } 
    println(firstEven)

    val lastOdd = numbers.last { it % 2 != 0 } 
    println(lastOdd)

    val firstorNull = empty.firstOrNull()                        
    val lastorNull = empty.lastOrNull()
    println(firstorNull)
    println(lastorNull)

    val firstF = words.firstOrNull { it.startsWith('f') }  
    val firstZ = words.firstOrNull { it.startsWith('z') }  
    val lastF = words.lastOrNull { it.endsWith('f') }      
    val lastZ = words.lastOrNull { it.endsWith('z') }  
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)
}