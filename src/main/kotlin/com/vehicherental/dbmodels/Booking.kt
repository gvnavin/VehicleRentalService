package com.vehicherental.dbmodels

import java.time.LocalDateTime

data class Booking(private val bookingId: String, private val vehicleType: VehicleType,
                   private val startTimestamp: LocalDateTime, private val endTimestamp: LocalDateTime)
