package behavioral.observer

fun main() {
    val weatherData = WeatherData()

    val currentDisplay = CurrentConditionsDisplay()
    val statisticsDisplay = StatisticsDisplay()

    weatherData.registerObserver(currentDisplay)
    weatherData.registerObserver(statisticsDisplay)

    weatherData.setMeasurements(25.3f, 65f, 1013f)
    weatherData.setMeasurements(26.7f, 70f, 1010f)
    weatherData.setMeasurements(24.8f, 60f, 1012f)
}
