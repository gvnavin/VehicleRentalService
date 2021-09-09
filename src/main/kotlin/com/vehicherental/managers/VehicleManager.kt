package com.vehicherental.managers

import com.vehicherental.dao.VehicleDao
import com.vehicherental.dbmodels.Vehicle
import com.vehicherental.dbmodels.VehicleType

class VehicleManager(private val vehicleDao: VehicleDao) {
    fun addVehicle(vehicleId: String, vehicleType: VehicleType, branchName: String) {
        vehicleDao.save(Vehicle(vehicleId, vehicleType, branchName))
    }
}
