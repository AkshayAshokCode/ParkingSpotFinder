package com.akshayashokcode.parkingspotfinder.domain.repository

import com.akshayashokcode.parkingspotfinder.domain.model.ParkingSpot
import kotlinx.coroutines.flow.Flow

interface ParkingSpotRepository {

    suspend fun insertParkingSpot(spot:ParkingSpot)

    suspend fun deleteParkingSpot(spot:ParkingSpot)

    fun getParkingSpots(): Flow<List<ParkingSpot>>
}