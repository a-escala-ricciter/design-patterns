package behavioral.observer

// Observer, Subscriber or Event Listener
interface WeatherListener {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}
