import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println(getWeatherReport())
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { 
        try {
            getTemperature()
        }
        catch(e: AssertionError) {
            println("Caught exception: $e")
            "{ Invalid temperature }"
        }
    }
    "Forecast: ${forecast.await()}. Temperature: ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(500)
    return "Rainy day"
}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Invalid temperature.")
    return "100\u00b0C"
}