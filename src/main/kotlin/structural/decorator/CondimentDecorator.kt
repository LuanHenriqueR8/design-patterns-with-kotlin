package structural.decorator

abstract class CondimentDecorator: Beverage() {

    abstract override fun getCondimentDescription(): String

}