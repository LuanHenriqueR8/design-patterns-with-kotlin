package creational.factorymethod.factory

import creational.factorymethod.Iphone
import creational.factorymethod.IphoneXSMax

class IphoneXSMaxFactory: IphoneFactory() {

    override fun createIphone(): Iphone = IphoneXSMax()
}