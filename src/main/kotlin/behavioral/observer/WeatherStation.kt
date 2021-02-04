package behavioral.observer

import java.util.*

fun main() {

    val weatherDataObservable = WeatherDataObservable()

    WeatherNotifierCompanyObserver(weatherDataObservable)
    WeatherNotifierCompanyObserver(weatherDataObservable)
    WeatherNotifierCompanyObserver(weatherDataObservable)
    WeatherNotifierCompanyObserver(weatherDataObservable)

    for (i in 0..2) {
        println("Information Updated")
        weatherDataObservable.setMeasurements(Random().nextFloat(), Random().nextFloat(), Random().nextFloat())
        Thread.sleep(3000)
    }

}