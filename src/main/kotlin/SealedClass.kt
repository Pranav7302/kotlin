


sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}

fun processResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
    }
}
fun main() {
    val successResult = Result.Success("Data received")
    val errorResult = Result.Error("Data not found")

    processResult(successResult)
    processResult(errorResult)
}




