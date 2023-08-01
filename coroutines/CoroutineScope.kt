import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println(getWeatherReport())
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "Forecast: ${forecast.await()}. Temperature: ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Rainy day"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}