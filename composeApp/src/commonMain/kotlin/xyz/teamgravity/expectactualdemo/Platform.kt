package xyz.teamgravity.expectactualdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform