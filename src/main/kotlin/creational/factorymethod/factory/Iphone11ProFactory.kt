package creational.factorymethod.factory

import creational.factorymethod.Iphone
import creational.factorymethod.Iphone11
import creational.factorymethod.Iphone11Pro
import creational.factorymethod.IphoneX

class Iphone11ProFactory: IphoneFactory() {

    override fun createIphone(): Iphone = Iphone11Pro()
}