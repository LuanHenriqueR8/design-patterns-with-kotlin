package structural.decorator

class Whip(private var beverage: Beverage): CondimentDecorator() {

    override fun getCondimentDescription(): String = "${beverage.getCondimentDescription()}, Whip"

    override fun cost(): Double = beverage.cost() + 0.30

}