package com.example.mydaggerapp.dagger

class Car (
    private val engine: Engine
) {
    fun start() {
        engine.start()
    }
}