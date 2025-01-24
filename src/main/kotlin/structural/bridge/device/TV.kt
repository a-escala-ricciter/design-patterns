package structural.bridge.device

// All devices follow the same interface.
class TV: Device {
    private var volume: Int = 0
    private var channel: Int = 0
    private var isEnabled: Boolean = false

    override fun isEnabled(): Boolean {
        return isEnabled
    }

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }

    override fun getVolume(): Int {
        return volume
    }

    override fun setVolume(percent: Int) {
        volume = percent
    }

    override fun getChannel(): Int {
        return channel
    }

    override fun setChannel(channel: Int) {
        this.channel = channel
    }
}
