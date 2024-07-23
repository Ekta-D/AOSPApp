package com.thalestask.myapplication

interface SpeedMonitoringService {
    fun checkSpeed(rentalId: String, currentSpeed: Double): Boolean
}