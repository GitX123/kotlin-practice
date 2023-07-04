class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
) {
    
}

fun main() {
    val fillInTheBlankQuestion = Question<String>("1 2 _", "3", "easy")
    val trueOrFalseQuestion = Question<Boolean>("Atom is the smallest particle", false, "medium")
    val numericQuestion = Question<Int>("Calculate 999*999", 998001, "hard")
}