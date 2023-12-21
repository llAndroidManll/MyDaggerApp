package com.example.mydaggerapp

import com.example.mydaggerapp.dagger.DaggerAppComponent


fun main() {
    println("Hello!")

    val appComponent = DaggerAppComponent.create()

    println(appComponent.computer)

}