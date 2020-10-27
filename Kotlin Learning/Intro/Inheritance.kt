open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main(){
    val dog = Dog()
    dog.sayHello()

    val dog2 = Yorkshire()
    dog2.sayHello()

    val dog3: Dog = Yorkshire()
    dog3.sayHello()

    val lion: Lion = Asiatic("Rouf")
    lion.sayHello()
}

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: groh!")
    }
}

class Asiatic (name: String) : Lion(name = name, origin = "India")
