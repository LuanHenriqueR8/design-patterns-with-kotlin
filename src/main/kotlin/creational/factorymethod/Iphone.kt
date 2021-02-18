package creational.factorymethod

abstract class Iphone {

    abstract fun getHardware()

    fun assemble() = println("Assembling the hardware")

    fun certificates() = println("Testing all certificates")

    fun pack() = println("Packing device")
}