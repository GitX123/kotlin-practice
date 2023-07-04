fun main() {
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // access elements
    println(solarSystem[0])
    println(solarSystem.get(1))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    // modify list
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[2] = "Home"
    printList(solarSystem)

    solarSystem.removeAt(9)
    solarSystem.remove("Theia")
    printList(solarSystem)
    println("Pluto" in solarSystem)
}

fun printList(list: List<String>) {
    print("List contents: ")
    for (element in list) {
        print(element + " ")
    }
    println()
}