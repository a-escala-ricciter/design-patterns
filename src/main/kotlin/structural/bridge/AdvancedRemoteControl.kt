package structural.bridge

import structural.bridge.device.Device

// You can extend classes from the abstraction hierarchy
// independently from device classes.
class AdvancedRemoteControl(device: Device) : RemoteControl(device) {
    fun mute() {
        device.setVolume(0)
    }
}
