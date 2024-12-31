package behavioral.observer

// Subject or Publisher
interface WeatherPublisher {
    fun registerObserver(observer: WeatherListener)
    fun removeObserver(observer: WeatherListener)
    fun notifyObservers()
}