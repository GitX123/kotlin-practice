fun main() {
    val solarSystem = mutableMapOf<String, Int>(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    // add key-value pair
    solarSystem["Pluto"] = 5
    solarSystem.put("Theia", 0)
}