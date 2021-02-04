package structural.decorator

class DarkRoast: Beverage() {

    init {
        description = "Dark Roast Coffee"
    }

    override fun cost(): Double = 0.99
}