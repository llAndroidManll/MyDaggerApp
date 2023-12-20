package com.example.mydaggerapp

import com.example.mydaggerapp.dagger.Car
import com.example.mydaggerapp.dagger.CarComponent
import com.example.mydaggerapp.dagger.DaggerCarComponent
import com.example.mydaggerapp.dagger.EngineModule

fun main() {
    println("Hello!")

    val carComponent = DaggerCarComponent.create();

    val car = Car(EngineModule.provideEngine()) // Create an instance of Car

    // Inject dependencies into the car instance
    carComponent.inject(car)

    car.start()
}