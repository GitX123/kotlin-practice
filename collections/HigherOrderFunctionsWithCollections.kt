class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

fun main() {
    val cookies = listOf(
        Cookie(
            name = "Chocolate chip",
            softBaked = false,
            hasFilling = false,
            price = 1.69
        ),
        Cookie(
            name = "Banana Walnut", 
            softBaked = true, 
            hasFilling = false, 
            price = 1.49
        ),
        Cookie(
            name = "Vanilla Creme",
            softBaked = false,
            hasFilling = true,
            price = 1.59
        )
    )

    // forEach()
    println("Menu: ")
    cookies.forEach { println(it.name) }
    println()

    // map()
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu: ")
    fullMenu.forEach { println(it) }
    println()

    // filter()
    val softBakedMenu = cookies.filter {
        it.softBaked
    }
    println("Soft baked menu: ")
    softBakedMenu.forEach { println(it.name) }
    println()

    // groupBy()
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }
    val softBakedMenu2 = groupedMenu[true] ?: emptyList()
    val crunchyMenu = groupedMenu[false] ?: emptyList()
    
    // fold()
    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")
    println()

    // sortedBy()
    val alphabeticalMenu = cookies.sortedBy{
        it.name
    }
    println("Alphabetical menu: ")
    alphabeticalMenu.forEach{ println(it.name)}
    println()
}