package com.example.kotlinmultiplatformproject
import kotlin.random.Random
class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWorld = if(Random.nextBoolean()) "Hi!" else "Hello!"
        return "$firstWorld Guess what this is! > ${platform.name.reversed()}"
    //        return "Hello, ${platform.name}!"

    }
}