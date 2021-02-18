package creational.factorymethod

import creational.factorymethod.factory.Iphone11Factory
import creational.factorymethod.factory.Iphone11ProFactory
import creational.factorymethod.factory.IphoneXFactory
import creational.factorymethod.factory.IphoneXSMaxFactory

fun main() {

    Iphone11ProFactory().orderIphone()
    Iphone11Factory().orderIphone()
    IphoneXFactory().orderIphone()
    IphoneXSMaxFactory().orderIphone()
}