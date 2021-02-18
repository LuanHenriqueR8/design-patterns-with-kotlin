package creational.factorymethod

class Iphone11Pro: Iphone() {

    override fun getHardware() = println("Iphone11Pro created")
}