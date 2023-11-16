

fun main()
{
    var i=1
    var is_Prime = false
    var number = 0
    while(i>0) {
        println("Enter a number")
        number = readln().toInt()
        if (number != null && number>0) {
                i = 0
                is_Prime = number.func()
        }
    }
    if(is_Prime)
    {
        println("$number is a prime number")
    }
    else
    {
        println("$number is not a prime number")
    }
}

fun Int.func(): Boolean{
    for (i in 2 until this-1)
    {
        if(this%i == 0)
        {
            return false
        }
    }
    return true
}