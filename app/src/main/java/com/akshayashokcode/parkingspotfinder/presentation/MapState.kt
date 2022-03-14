package com.akshayashokcode.parkingspotfinder.presentation

import com.akshayashokcode.parkingspotfinder.domain.model.ParkingSpot
import com.google.maps.android.compose.MapProperties

data class MapState(
    val properties:MapProperties=MapProperties(),
    val parkingSpots:List<ParkingSpot> = emptyList(),
    val isFallOutMap:Boolean=false
)
