package com.vehicherental.managers

import com.vehicherental.dao.BranchDao
import com.vehicherental.dbmodels.Branch
import com.vehicherental.dbmodels.Vehicle

class BranchManager(private val branchDao: BranchDao) {
    fun addBranch(branchName: String) {
        branchDao.save(Branch(branchName))
    }

    fun getAllVechicles(): List<Vehicle> {
        return listOf()
    }
}
