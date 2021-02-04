package structural.decorator

fun main() {

    val espresso = Espresso()
    println("${espresso.getCondimentDescription()} -> $${espresso.cost()}")

    var darkRoast: Beverage = DarkRoast()
    darkRoast = Mocha(darkRoast)
    darkRoast = Mocha(darkRoast)
    darkRoast = Whip(darkRoast)
    println("${darkRoast.getCondimentDescription()} -> $${darkRoast.cost()}")

    var houseBlend: Beverage = HouseBlend()
    houseBlend = Soy(houseBlend)
    houseBlend = Mocha(houseBlend)
    houseBlend = Whip(houseBlend)
    println("${houseBlend.getCondimentDescription()} -> $${houseBlend.cost()}")

}