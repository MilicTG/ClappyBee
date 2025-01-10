package dev.milic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform