class Person(val firstName : String, val age : Int) {
    var message:String = "Nothing"

    constructor(name : String , age :Int ,message :String):this(name,age){
        this.message = message
    }
}