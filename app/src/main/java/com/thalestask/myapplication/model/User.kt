package com.thalestask.myapplication.model


data class Car(
    val id: String,
    val model: String
)

data class Rental(
    val rentalId: String,
    val car: Car,
    val customerId: String,
    val maxSpeed: Double
)
