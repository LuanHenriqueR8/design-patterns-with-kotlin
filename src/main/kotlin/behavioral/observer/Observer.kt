package behavioral.observer

interface Observer {

    fun update(temp: Float, humidity: Float, pressure: Float)

    fun display()
}