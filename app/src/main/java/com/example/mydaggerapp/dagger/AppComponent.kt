package com.example.mydaggerapp.dagger

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    val computer: Computer

    fun inject(computer: Computer)


}