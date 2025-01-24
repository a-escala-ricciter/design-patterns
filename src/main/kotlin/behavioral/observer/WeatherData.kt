package behavioral.observer

// Concrete Subject/Publisher
class WeatherData : WeatherPublisher {
    private val observers = mutableListOf<WeatherListener>()
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun registerObserver(observer: WeatherListener) {
        observers.add(observer)
    }

    override fun removeObserver(observer: WeatherListener) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    // Method to update weather data and notify observers
    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }
}
