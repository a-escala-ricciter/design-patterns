package behavioral.observer

// Concrete Observer 1: Display Panel
class CurrentConditionsDisplay : WeatherListener {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    fun display() {
        println("Current conditions: $temperature°C and $humidity% humidity")
    }
}
