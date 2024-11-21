package org.dbng.travelapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform