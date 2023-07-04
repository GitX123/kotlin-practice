class Quiz {
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

// extension property
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered."

// extension function
fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) {print("▓")}
    repeat(Quiz.total - Quiz.answered) {print("▒")}
    println()
}

fun main() {
    Quiz.printProgressBar()
    println(Quiz.progressText)
}