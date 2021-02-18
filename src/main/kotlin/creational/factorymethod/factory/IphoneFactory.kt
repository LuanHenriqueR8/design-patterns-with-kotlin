package creational.factorymethod.factory

import creational.factorymethod.Iphone

abstract class IphoneFactory {

    protected abstract fun createIphone(): Iphone

    fun orderIphone(): Iphone {
        val device: Iphone = createIphone()
        device.assemble()
        device.certificates()
        device.pack()
        device.getHardware()
        return device
    }



}