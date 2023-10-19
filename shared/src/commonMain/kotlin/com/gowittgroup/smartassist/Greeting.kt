package com.gowittgroup.smartassist

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val platform: Platform = getPlatform()
    private val client = HttpClient()

    suspend fun greeting(): String {
        val response = client.get("https://ktor.io/docs/")
        return response.bodyAsText()
    }

    fun getPlatformInfo(): String {
        return "Platform: ${platform.name}!"
    }
}
