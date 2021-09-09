package com.vehicherental.dao

import com.vehicherental.db.DB
import com.vehicherental.db.TableName
import com.vehicherental.dbmodels.RentalPrice
import com.vehicherental.dbmodels.VehicleType

class RentalPriceDao(private val db: DB) : CRUDDao<RentalPrice> {

    override fun save(e: RentalPrice) {
        db.save(TableName.RentalPrice ,e)
    }

    override fun getByField(key: String, value: String): RentalPrice {
        return RentalPrice("", VehicleType.Hatchback, 0)
    }

}
