

fun main()
{
    //Mutable.fixed size -  array Lists

    val arrayList = Array<Int>(5){ 0 }
    val intArray1 = IntArray(5)
     intArray1[0]=2
    println(intArray1[0])

    val intArray = IntArray(5)
    for (array in intArray)
    {
        println(array)
    }

    //2d array
    val rows = 3
    val columns = 3
    // Creating a 3x3 matrix with sequential values
    val matrix = Array(rows) { row ->
        IntArray(columns) { col ->
            0
        }
    }

    // Printing the matrix
    for (row in matrix) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
}





