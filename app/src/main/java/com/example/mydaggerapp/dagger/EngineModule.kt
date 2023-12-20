package com.example.mydaggerapp.dagger

import dagger.Module
import dagger.Provides

@Module
object EngineModule {

    @Provides
    fun provideEngine() : Engine {
        return ElectricEngine()
    }

}