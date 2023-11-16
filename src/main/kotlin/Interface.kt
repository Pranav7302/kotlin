

interface sum
{
    fun add(a: Int,b: Int)
}

fun main()
{
    val calc = Calculator()
    calc.add(5,6)
}

class Calculator(): sum{
    override fun add(a: Int,b: Int) {
       print("The sum is ${a+b}")
    }
}