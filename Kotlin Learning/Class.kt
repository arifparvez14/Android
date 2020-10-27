
//In kotlin class is reference type. See the line below

class Customer

class Contact(var id: Int, var email: String)

fun main() {
    var contact = Contact(1, "a@a.com")
    println(contact.id)

    var contact2 = contact
    contact2.id = 10

    println(contact.id)
    println(contact2.id)
}