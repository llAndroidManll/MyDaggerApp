package com.example.mydaggerapp.dagger

import com.example.mydaggerapp.dagger.pcParts.AsusBoard
import com.example.mydaggerapp.dagger.pcParts.Intel
import com.example.mydaggerapp.dagger.pcParts.Kingston
import com.example.mydaggerapp.dagger.pcParts.KingstonRAM
import com.example.mydaggerapp.dagger.pcParts.MotherBoard
import com.example.mydaggerapp.dagger.pcParts.Processor
import com.example.mydaggerapp.dagger.pcParts.RAM
import com.example.mydaggerapp.dagger.pcParts.SSD
import dagger.Module
import dagger.Provides

@Module
object AppModule {

    @Provides
    fun provideComputer(
        processor: Processor,
        ram: RAM,
        ssd: SSD,
        motherBoard: MotherBoard
    ) : Computer {
        return Computer(ram,ssd,motherBoard,processor)
    }

    @Provides
    fun provideProcessor() : Processor {
        return Intel()
    }

    @Provides
    fun provideRAM() : RAM {
        return KingstonRAM()
    }

    @Provides
    fun provideSSD() : SSD {
        return Kingston()
    }

    @Provides
    fun provideMotherBoard() : MotherBoard {
        return AsusBoard()
    }

}