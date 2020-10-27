//A list is an ordered collection of items
// In Kotlin, lists can be either mutable (MutableList) or read-only (List)
// For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists
// To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSundoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  
    return sudoers
}

fun main() {
    addSundoer(4)
    println("Total sudoers: ${getSysSudoers().size}") 

    getSysSudoers().forEach {                                    
        i -> println("Some useful info on user $i")
    }
}