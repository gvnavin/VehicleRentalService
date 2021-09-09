package com.vehicherental.managers

import com.vehicherental.dao.BookingDao
import com.vehicherental.dbmodels.Booking
import com.vehicherental.dbmodels.VehicleType
import java.time.LocalDateTime
import java.util.*

class BookingManager(private val bookingDao: BookingDao) {
    fun bookVehicle(vehicleType: VehicleType, startTimestamp: LocalDateTime, endTimestamp: LocalDateTime) {
        bookingDao.save(
            Booking(
                UUID.randomUUID().toString(),
                vehicleType,
                startTimestamp,
                endTimestamp
            )
        )
    }
}
