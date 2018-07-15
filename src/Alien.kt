class Alien {
    var skills : String = "null"

    fun printMySkills(){
        println(skills)
    }

    companion object {
        fun show(): String{
            return "You re learning kotlin.."
        }
    }
}