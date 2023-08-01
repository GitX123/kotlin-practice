import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val t1 = measureTimeMillis {
        runBlocking {
            println("Hello!")
            printForecast()    
            printTemperature()   
            println("Have a good day!")
        }
    }
    println("Execution time: ${t1 / 1000.0}s")

    println("---------------------------------------")

    val t2 = measureTimeMillis {
        runBlocking {
            println("Hello!")
            launch {
                printForecast()    
            }
            launch {
                printTemperature()   
            }
            println("Have a good day!")
        }
    }
    println("Execution time: ${t2 / 1000.0}s")
}

suspend fun printForecast() {
    delay(1000)
    println("Rainy day")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}