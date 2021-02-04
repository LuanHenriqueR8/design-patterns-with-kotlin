package structural.decorator

class Soy(private var beverage: Beverage): CondimentDecorator() {

    override fun getCondimentDescription(): String = "${beverage.getCondimentDescription()}, Soy"

    override fun cost(): Double = beverage.cost() + 0.45

}