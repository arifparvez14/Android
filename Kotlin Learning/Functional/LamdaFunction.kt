val upperCase1: (String) -> (String) = { str: String -> str.toUpperCase()}
val upperCase2: (String) -> (String) = { str -> str.toUpperCase()}
val upperCase3 = { str: String -> str.toUpperCase() } 
val upperCase5: (String) -> String = { it.toUpperCase() } 
val upperCase6: (String) -> String = String::toUpperCase   

fun main(){
    println(upperCase1("hello"))
    println(upperCase2("hi"))
    println(upperCase3("Nice to meet you"))
    println(upperCase5("happy to be here"))
    println(upperCase6("st"))
}