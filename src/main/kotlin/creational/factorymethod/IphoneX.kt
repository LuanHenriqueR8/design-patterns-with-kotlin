package creational.factorymethod

class IphoneX: Iphone() {

    override fun getHardware() = println("IphoneX created")
}