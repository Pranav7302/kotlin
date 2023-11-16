

fun main()
{
    val lambda: (Int,Int) -> Int = { x:Int , y: Int -> x+y}
    add(5,6,lambda)


    val myCircle = Circle(4.0)
    val myCircle1 = Circle(5.0)
    val myCircle2 = Circle(6.0)
    var shapes = listOf<Shape>(myCircle,myCircle1,myCircle2)
    shapes = shapes.filter { it.area() >= 51.0 }.sortedByDescending { it.area() }
    for (shape in shapes)
    {
        println("area = ${shape.area()}, name = ${shape.name}")
    }
}


fun add(a: Int,b: Int, action: (Int,Int) -> Int)
{
    var res = action(a,b)
    println("$res")
}