package com.vehicherental.dao

import com.vehicherental.db.DB
import com.vehicherental.db.TableName
import com.vehicherental.dbmodels.Booking
import com.vehicherental.dbmodels.VehicleType
import java.time.LocalDateTime

class BookingDao(private val db: DB): CRUDDao<Booking> {

    override fun save(e: Booking) {
        db.save(TableName.Booking ,e)
    }

    override fun getByField(key: String, value: String): Booking {
        return Booking("", VehicleType.Hatchback, LocalDateTime.now(), LocalDateTime.now())
    }

}
