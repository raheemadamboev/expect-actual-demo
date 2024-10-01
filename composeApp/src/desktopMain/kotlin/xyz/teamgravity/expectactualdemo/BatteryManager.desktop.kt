package xyz.teamgravity.expectactualdemo

import oshi.SystemInfo
import kotlin.math.roundToInt

actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val system = SystemInfo()
        val level = system.hardware.powerSources.firstOrNull() ?: return -1
        return (level.remainingCapacityPercent * 100).roundToInt()
    }
}