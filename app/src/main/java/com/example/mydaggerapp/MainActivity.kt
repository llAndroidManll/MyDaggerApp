package com.example.mydaggerapp

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.example.mydaggerapp.dagger.AppComponent
import com.example.mydaggerapp.dagger.Computer
import com.example.mydaggerapp.dagger.DaggerAppComponent
import javax.inject.Inject

class MainApp : Application() {

    private lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

class MainActivity : Activity() {
    
    @Inject
    lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(this.toString(), computer.toString())
    }
}