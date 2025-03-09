package com.chat

import com.chat.plugins.configureMonitoring
import com.chat.plugins.configureRouting
import com.chat.plugins.configureSecurity
import com.chat.plugins.configureSerialization
import com.chat.plugins.configureSockets
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSockets()
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureRouting()
}
