
class Circle(
    private val radius: Double
) : Shape() {
    val pi = 3.14
    init {
       println("Circle is called")
   }

    override fun area() = pi*radius*radius
}