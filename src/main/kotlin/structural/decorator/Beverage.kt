package structural.decorator

abstract class Beverage {

    protected var description: String = "Unknown Beverage"

    abstract fun cost(): Double

    open fun getCondimentDescription() = description

}