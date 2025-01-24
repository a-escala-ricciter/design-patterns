package structural.facade

// Subsystem Classes
class TV {
    fun turnOn() = println("TV is turned on")
    fun setInputChannel(channel: String) = println("TV input channel set to $channel")
    fun turnOff() = println("TV is turned off")
}

class SoundSystem {
    fun turnOn() = println("Sound System is turned on")
    fun setVolume(level: Int) = println("Sound System volume set to $level")
    fun turnOff() = println("Sound System is turned off")
}

class StreamingService {
    fun connect() = println("Connected to streaming service")
    fun playMovie(movie: String) = println("Playing movie: $movie")
    fun disconnect() = println("Disconnected from streaming service")
}

// Facade
class HomeTheaterFacade(
    private val tv: TV,
    private val soundSystem: SoundSystem,
    private val streamingService: StreamingService
) {
    fun startMovieNight(movie: String) {
        println("Starting movie night...")
        tv.turnOn()
        tv.setInputChannel("HDMI 1")
        soundSystem.turnOn()
        soundSystem.setVolume(25)
        streamingService.connect()
        streamingService.playMovie(movie)
        println("Enjoy your movie!")
    }

    fun endMovieNight() {
        println("Ending movie night...")
        streamingService.disconnect()
        soundSystem.turnOff()
        tv.turnOff()
        println("Good night!")
    }
}

// Client Code
fun main() {
    val tv = TV()
    val soundSystem = SoundSystem()
    val streamingService = StreamingService()

    val homeTheater = HomeTheaterFacade(tv, soundSystem, streamingService)

    homeTheater.startMovieNight("Inception")
    println("\n--- After the movie ---\n")
    homeTheater.endMovieNight()
}
