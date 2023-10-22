package com.example.se

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform