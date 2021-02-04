package behavioral.observer

import java.util.ArrayList
import java.util.function.Consumer


class WeatherDataObservable(
    private var observers: MutableList<Observer> = ArrayList()
) : Subject {

    private var temp = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach(Consumer { observer -> observer.update(temp, humidity, pressure) })
    }

    private fun measurementsChanged() = notifyObservers()


    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.pressure = pressure
        this.humidity = humidity
        this.temp = temp
        measurementsChanged()
    }
}