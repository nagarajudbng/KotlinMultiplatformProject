package com.example.kotlinmultiplatformproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform