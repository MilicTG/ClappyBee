package dev.milic


enum class Platform {
    Android,
    iOS,
    Web,
    Desktop
}

expect fun getPlatform(): Platform