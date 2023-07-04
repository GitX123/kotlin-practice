fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets


    println("Array size: ${solarSystem.size}")
    print("Content: ")
    for (planet in solarSystem) 
        print("${planet} ")
    println()
}