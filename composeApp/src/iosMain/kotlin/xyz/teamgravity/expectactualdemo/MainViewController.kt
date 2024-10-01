package xyz.teamgravity.expectactualdemo

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    App(
        manager = remember { BatteryManager() }
    )
}