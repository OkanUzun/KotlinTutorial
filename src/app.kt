fun main(args: Array<String>) {

    //PRINT
    println("Hello World")

    //DECLARE ARRAY
    val items = listOf(1, 2, 3, 4)

    //LIST FILTER
    println(items.filter { it % 2 == 0 })

    //RANGE
    for (i in 2..6)
        println(i)

    //INDEX VALUE
    for ((index, value) in (3..9).withIndex())
        println("$index --> $value")

    //CALL A FUNCTION
    println(multipleByTwo(5))

    //CREATE INSTANCE OF CLASS
    var obj = myClass()
    obj.printSiteUrl()

    //WHEN
    val x = 5
    when(x){
        1,2 -> println(" Value of X either 1,2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    //PRIMARY AND SECONDARY CONSTRUCTOR
    val person1 = Person("Okan", 25)
    println("First name : ${person1.firstName}")
    println("Age : ${person1.age}")
    println("Message :  ${person1.message}")

    println()

    val person2 = Person("Anıl", 13, "Heyyyy")
    println("First name : ${person2.firstName}")
    println("Age : ${person2.age}")
    println("Message :  ${person2.message}")



}

fun multipleByTwo(x: Int): Int {
    return x * 2
}