package behavioral.observer

class WeatherNotifierCompanyObserver(weatherDataObservable: WeatherDataObservable) : Observer {

    private var temp = 0f
    private var humidity = 0f
    private var pressure = 0f

    init {
        weatherDataObservable.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temp = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() = println("Temperature: $temp, Pressure: $pressure, Humidity: $humidity")

}