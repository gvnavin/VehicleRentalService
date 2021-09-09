package com.vehicherental.managers

import com.vehicherental.dbmodels.Vehicle

interface SelectionStrategy {
    fun select(vehicles: List<Vehicle>): Vehicle
}
