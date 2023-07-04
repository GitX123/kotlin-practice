enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main(args: Array<String>) {
    println(Difficulty.EASY)
    for (difficulty in Difficulty.values()) {
        println(difficulty)
    }
}