package com.vehicherental.managers

import com.vehicherental.dao.RentalPriceDao
import com.vehicherental.dbmodels.RentalPrice
import com.vehicherental.dbmodels.Vehicle
import com.vehicherental.dbmodels.VehicleType

class RentalPriceManager(private val rentalPriceDao: RentalPriceDao) {

    fun allocatePrice(branchName: String, vehicleType: VehicleType, cost: Int) {
        rentalPriceDao.save(RentalPrice(branchName, vehicleType, cost))
    }

    fun select(allListOfVehicles: List<Vehicle>) {


    }

    fun getSelectionStrategy() {

    }
}
