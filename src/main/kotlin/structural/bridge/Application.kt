package structural.bridge

import structural.bridge.device.Radio
import structural.bridge.device.TV

fun main() {
    val tv = TV()
    var remote = RemoteControl(tv)
    remote.togglePower()

    val radio = Radio()
    remote = AdvancedRemoteControl(radio)
    remote.mute()
}
