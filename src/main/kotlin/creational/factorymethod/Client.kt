package creational.factorymethod

import creational.factorymethod.factory.Iphone11Factory
import creational.factorymethod.factory.Iphone11ProFactory
import creational.factorymethod.factory.IphoneXFactory
import creational.factorymethod.factory.IphoneXSMaxFactory

fun main() {

    val iphone11Pro = Iphone11ProFactory().orderIphone()
    iphone11Pro.getHardware()

    val iphone11 = Iphone11Factory().orderIphone()
    iphone11.getHardware()

    val iphoneX = IphoneXFactory().orderIphone()
    iphoneX.getHardware()

    val iphoneXSMax = IphoneXSMaxFactory().orderIphone()
    iphoneXSMax.getHardware()
}