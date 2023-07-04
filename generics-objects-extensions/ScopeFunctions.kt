enum class Difficulty {
    EASY, MEDIUM, HARD
}

data class Question<T> (
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question = Question("1 2 _", "3", Difficulty.EASY)

    // let()
    fun printQuiz() {
        question.let {
            println("Question: ${it.questionText}")
            println("Answer: ${it.answer}")
            println("Difficulty: ${it.difficulty}")
        }
    }
}

fun main() {
    val quiz = Quiz()
    quiz.printQuiz()

    // apply()
    val quiz2 = Quiz().apply{
        printQuiz()
    }
}