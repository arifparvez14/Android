//In Kotlin you also have the object keyword. It is used to obtain a data type with a single implementation.

//An object declaration inside a class defines another useful case: the companion object. 
//Syntactically it's similar to the static methods in Java: you call object members using its class name as a qualifier.

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  

    val dayRates = object {                                                     
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       

    print("Total price: $$total")                                               

}

object DoAuth {                                                 //1 
    fun takeParams(username: String, password: String) {        //2 
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {                                  
    companion object Bonger {                  
        fun getBongs(nTimes: Int) {            
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    rentPrice(10, 2, 1)
    println()
    DoAuth.takeParams("foo", "qwerty") 
    BigBen.getBongs(12)                                                          
}