package com.chat

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
