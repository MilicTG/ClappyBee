package dev.milic.util


enum class Platform {
    Android,
    iOS,
    Web,
    Desktop
}

expect fun getPlatform(): Platform