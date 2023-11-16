

fun main() {
    val number = 100
    val factorialResult = factorial(number)
    println("Factorial of $number is: $factorialResult")
}

fun factorial(n: Int, acc: Long = 1): Long {
    return if (n == 0 || n == 1) {
        acc
    } else {
        factorial(n - 1, n * acc)
    }
}
