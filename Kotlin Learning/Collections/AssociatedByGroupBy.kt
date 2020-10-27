// Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key
// associateBy uses the last suitable element as the value
// groupBy builds a list of all suitable elements and puts it in the value

data class Person(val name: String, val city: String, val phone: String)

val people = listOf(                                                     // 2
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

fun main() {
    val phoneBook = people.associateBy {it.phone}
    println(phoneBook)
    
    val cityBook = people.associateBy(Person::phone, Person::city)
    println(cityBook)

    val peopleCities = people.groupBy(Person::city, Person::name) 
    println(peopleCities)
}

