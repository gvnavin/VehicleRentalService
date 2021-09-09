package com.vehicherental.dao

import com.vehicherental.dbmodels.Vehicle

interface CRUDDao<E> {
    fun save(e:E)
    fun getByField(key: String, value: String): E
    fun getAllVehiclesBook(): List<Vehicle>

}
