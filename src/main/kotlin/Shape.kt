abstract class Shape (
    var name: String = "Shape"
){
    init {
        println("Shape block")
    }

    fun changeName(newName: String){
        name = newName;
    }
    abstract fun area() : Double
}