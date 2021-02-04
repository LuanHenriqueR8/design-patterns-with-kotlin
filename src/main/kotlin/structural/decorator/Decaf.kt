package structural.decorator

class Decaf: Beverage() {

    init {
        description = "Decaf"
    }

    override fun cost(): Double = 1.05
}