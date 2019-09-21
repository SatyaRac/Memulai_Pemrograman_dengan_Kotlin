import kotlinx.coroutines.*

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    return (valueA + valueB)
}

// TODO 2
suspend fun multiple(valueC: Int, valueD: Int): Int {
    delay(2000L)
    return (valueC * valueD)
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum : ${resultSum.await()}")
    println("Result multiple : ${resultMultiple.await()}")
}