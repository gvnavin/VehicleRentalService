package com.vehicherental.managers

import com.vehicherental.dao.BookingDao
import com.vehicherental.dbmodels.Booking
import com.vehicherental.dbmodels.Vehicle
import com.vehicherental.dbmodels.VehicleType
import java.time.LocalDateTime
import java.util.*

class BookingManager(private val bookingDao: BookingDao,
                     private val branchManager: BranchManager,
                     private val rentalPriceManager: RentalPriceManager) {

    fun bookVehicle(vehicleType: VehicleType, startTimestamp: LocalDateTime, endTimestamp: LocalDateTime) {

        val allListOfVehicles: List<Vehicle> = getAvailableVehicles()
        rentalPriceManager.select(allListOfVehicles)

        bookingDao.save(
            Booking(
                UUID.randomUUID().toString(),
                vehicleType,
                startTimestamp,
                endTimestamp
            )
        )
    }

    private fun getAvailableVehicles(): List<Vehicle> {
        val listOfVehiclesBooked: List<Vehicle> = bookingDao.getAllVehiclesBook()
        val allListOfVehicles: List<Vehicle> = branchManager.getAllVechicles()
        return allListOfVehicles - listOfVehiclesBooked;
    }

}
