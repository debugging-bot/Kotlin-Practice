class Animal(val name: String)

class Person(val firstName: String, _lastName: String) {
    var lastName: String = _lastName
    	get () = field.uppercase()
        set (value) {
            field = "[$value]"
        }
}

fun main() {
    val a = Animal("Dog")
    println("Animal: ${a.name}")
    
    val p = Person("SeungJik", "Lee")
    println("Name: ${p.firstName} ${p.lastName}")
    
    p.lastName = "LEE"
    println("Name: ${p.firstName} ${p.lastName}")
}
