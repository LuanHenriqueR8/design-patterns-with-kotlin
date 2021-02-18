package creational.factorymethod

class Iphone11: Iphone() {

    override fun getHardware() = println("IphoneXSMax created")
}