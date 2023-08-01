import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val forecast: Deferred<String> = async { getForecast() }
        val temperature: Deferred<String> = async { getTemperature() }
        println("Forecast: ${forecast.await()}. Temperature: ${temperature.await()} \u00b0C")
    }
}

suspend fun getForecast(): String {
    delay(1000)
    return "Rainy day"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}