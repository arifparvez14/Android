val empty = "test".let {               
    //customPrint(it)                    
    it.isEmpty()                       
}
println(" is empty: $empty")


fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {                         
        print("\t")
        //customPrint(it)
        println()
    }
}

fun main() {
    printNonNull(null)
    printNonNull("my string") 
}