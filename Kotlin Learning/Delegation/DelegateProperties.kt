import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()                                               

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2     
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

class LazySample {
    init {
      println("created!")            
    }
    
    val lazyStr: String by lazy {
        println("computed!")          
        "my lazy"
    }
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"


    val sample = LazySample()    
    println("lazyStr = ${sample.lazyStr}") 
    println(" = ${sample.lazyStr}")
}