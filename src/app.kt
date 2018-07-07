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

}

fun multipleByTwo(x: Int): Int {
    return x * 2
}