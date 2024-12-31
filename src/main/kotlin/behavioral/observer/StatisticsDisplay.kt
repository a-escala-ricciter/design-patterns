package behavioral.observer

// Concrete Observer 2: Statistics Panel
class StatisticsDisplay : WeatherListener {
    private val temperatureHistory = mutableListOf<Float>()

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        temperatureHistory.add(temperature)
        display()
    }

    fun display() {
        val averageTemp = temperatureHistory.average()
        println("Average temperature: ${"%.2f".format(averageTemp)}°C")
    }
}
