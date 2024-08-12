package com.example

import com.example.plugins.*
import io.ktor.server.application.*
import org.koin.core.context.startKoin


fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused")
fun Application.module() {
    startKoin(){
        modules(com.example.DI.mainModule)
    }
    configureSockets()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()

}
