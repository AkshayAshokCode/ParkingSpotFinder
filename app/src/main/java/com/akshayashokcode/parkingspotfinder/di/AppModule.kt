package com.akshayashokcode.parkingspotfinder.di

import android.app.Application
import androidx.room.Room
import com.akshayashokcode.parkingspotfinder.data.ParkingSpotDatabase
import com.akshayashokcode.parkingspotfinder.data.ParkingSpotRepositoryImpl
import com.akshayashokcode.parkingspotfinder.domain.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideParkingSpotDatabase(app:Application):ParkingSpotDatabase{
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parking_spots.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingRepository(db:ParkingSpotDatabase):ParkingSpotRepository{
        return ParkingSpotRepositoryImpl(db.dao)
    }
}