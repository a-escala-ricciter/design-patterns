package structural.bridge

import structural.bridge.device.Device

// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all the real work to this object.
open class RemoteControl(
    protected val device: Device
) {
    fun togglePower() {
        if (device.isEnabled()) {
            device.disable()
        } else {
            device.enable()
        }
    }

    fun volumeDown() {
        device.setVolume(device.getVolume() - VOLUME_STEP)
    }

    fun volumeUp() {
        device.setVolume(device.getVolume() + VOLUME_STEP)
    }

    fun channelDown() {
        device.setChannel(device.getChannel() - CHANNEL_STEP)
    }

    fun channelUp() {
        device.setChannel(device.getChannel() + CHANNEL_STEP)
    }

    companion object {
        private const val VOLUME_STEP: Int = 10
        private const val CHANNEL_STEP: Int = 1
    }
}