package com.thalestask.myapplication.network

import com.thalestask.myapplication.CommunicationChannel
import com.thalestask.myapplication.SpeedMonitoringService
import com.thalestask.myapplication.model.Rental


class SpeedMonitoringServiceImpl(
    private val rentals: Map<String, Rental>,
    private val communicationChannel: CommunicationChannel
) : SpeedMonitoringService {
    override fun checkSpeed(rentalId: String, currentSpeed: Double): Boolean {
        val rental = rentals[rentalId] ?: return false
        if (currentSpeed > rental.maxSpeed) {
            val message = "Warning: Car ${rental.car.model} with ID ${rental.car.id} exceeded the speed limit of ${rental.maxSpeed} km/h."
            communicationChannel.sendNotification(message)
            return true
        }
        return false
    }
}
