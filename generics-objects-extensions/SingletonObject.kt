// singleton object
object LoggedInUser {
    var id: Int = 1
    var name: String = "James"
}

// companion object
class Group {
    companion object LoggedInUser {
        var id: Int = 2
        var name: String = "Jerome"
    }
}

fun main() {
    println("Logged in user right now: id = ${LoggedInUser.id}, name = ${LoggedInUser.name}")
    println("Logged in user in the group: id = ${Group.id}, name = ${Group.name}")
}