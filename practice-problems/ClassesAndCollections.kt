enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

// extension
val Event.durationOfEvent: String
    get() = if(this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main(args: Array<String>) {
    // events
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 100)

    // list of events
    val events = mutableListOf(
        event1, 
        event2,
        event3
    )

    // filter short events
    val shortEvents = events.filter{
        it.durationInMinutes < 60
    }
    println("You have ${shortEvents.size} short events.")
    println()

    // group by daypart
    val eventsByDaypart = events.groupBy {
        it.daypart
    }
    println("Summary by daypart: ")
    eventsByDaypart.forEach{ (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
    println()

    // last event
    println("Last event of the day: ${events.last().title}")
    println()
    
    // using extension property
    println("Event title: ${events[2].title}, duration: ${events[2].durationOfEvent}")
}