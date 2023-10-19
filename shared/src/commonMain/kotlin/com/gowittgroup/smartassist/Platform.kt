package com.gowittgroup.smartassist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
