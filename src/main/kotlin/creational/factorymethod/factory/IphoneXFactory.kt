package creational.factorymethod.factory

import creational.factorymethod.Iphone
import creational.factorymethod.IphoneX

class IphoneXFactory: IphoneFactory() {

    override fun createIphone(): Iphone = IphoneX()
}