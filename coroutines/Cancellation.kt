import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println(getWeatherReport())
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    temperature.cancel()
    "Forecast: ${forecast.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Rainy day"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}