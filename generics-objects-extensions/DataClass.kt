enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T> (
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question = Question("1 2 _", "3", Difficulty.EASY)
    println(question)
    println(question.toString())
    println(question.component1())
    println(question.component2())
    println(question.component3())
}