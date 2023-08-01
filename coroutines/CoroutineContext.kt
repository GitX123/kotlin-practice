import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("${Thread.currentThread().name}")
        launch {
            withContext(Dispatchers.Default) {
                println("${Thread.currentThread().name}")
            }
        }
    }
}