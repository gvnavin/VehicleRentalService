package com.vehicherental

import com.vehicherental.dbmodels.VehicleType
import com.vehicherental.managers.BookingManager
import com.vehicherental.managers.BranchManager
import com.vehicherental.managers.RentalPriceManager
import com.vehicherental.managers.VehicleManager
import java.time.LocalDateTime

class Delegator(
    private val branchManager: BranchManager,
    private val rentalPriceManager: RentalPriceManager,
    private val vehicleManager: VehicleManager,
    private val bookingManager: BookingManager,
) {

    fun addBranch(branchName: String) {
        branchManager.addBranch(branchName)
    }

    fun allocatePrice(branchName: String, vehicleType: VehicleType, cost: Int) {
        rentalPriceManager.allocatePrice(branchName, vehicleType, cost)
    }

    fun addVehicle(vehicleId: String, vehicleType: VehicleType, branchName: String) {
        vehicleManager.addVehicle(vehicleId, vehicleType, branchName)
    }

    fun bookVehicle(vehicleType: VehicleType, startTimestamp: LocalDateTime, endTimestamp: LocalDateTime) {
        bookingManager.bookVehicle(vehicleType, startTimestamp, endTimestamp)
    }
}
