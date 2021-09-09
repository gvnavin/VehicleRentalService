package com.vehicherental.dao

import com.vehicherental.db.DB
import com.vehicherental.db.TableName
import com.vehicherental.dbmodels.Vehicle
import com.vehicherental.dbmodels.VehicleType

class VehicleDao(private val db: DB) : CRUDDao<Vehicle> {
    override fun save(e: Vehicle) {
        db.save(TableName.Vehicle ,e)
    }

    override fun getByField(key: String, value: String): Vehicle {
        return Vehicle("", VehicleType.Hatchback, "")
    }

}
