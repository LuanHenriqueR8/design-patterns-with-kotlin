package structural.decorator

class HouseBlend: Beverage() {

    init {
        description = "House Blend Coffee"
    }

    override fun cost(): Double = 0.89
}