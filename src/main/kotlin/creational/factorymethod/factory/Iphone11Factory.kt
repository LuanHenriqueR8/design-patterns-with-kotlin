package creational.factorymethod.factory

import creational.factorymethod.Iphone
import creational.factorymethod.Iphone11
import creational.factorymethod.IphoneX

class Iphone11Factory : IphoneFactory() {

    override fun createIphone(): Iphone = Iphone11()
}