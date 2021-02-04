package structural.decorator

class Mocha(var beverage: Beverage) : CondimentDecorator() {

    override fun cost(): Double {
        return beverage.cost() + .20
    }

    override fun getCondimentDescription(): String {
        return this.beverage.getCondimentDescription() + ", Mocha"
    }
}