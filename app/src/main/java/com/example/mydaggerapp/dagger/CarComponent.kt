package com.example.mydaggerapp.dagger

import dagger.Component

@Component(modules = [EngineModule::class])
interface CarComponent {

    fun inject(car : Car)

}