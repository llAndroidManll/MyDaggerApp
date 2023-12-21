package com.example.mydaggerapp.dagger

import com.example.mydaggerapp.dagger.pcParts.MotherBoard
import com.example.mydaggerapp.dagger.pcParts.Processor
import com.example.mydaggerapp.dagger.pcParts.RAM
import com.example.mydaggerapp.dagger.pcParts.SSD

class Computer (
    private val ram: RAM,
    private val ssd: SSD,
    private val motherBoard: MotherBoard,
    private val processor: Processor,

    ) {
    fun turnOn() {
        println("Computer is turned on !")
    }
    fun turnOff() {
        println("Computer is turned off !")
    }

    override fun toString(): String {
        return "Computer[" +
                "RAM: ${ram.ramName()} ; " +
                "SSD: ${ssd.ssdName()} ; " +
                "MotherBoard: ${motherBoard.motherBoardName()} ; " +
                "Processor: ${processor.processorName()}" +
                "]"
    }
}