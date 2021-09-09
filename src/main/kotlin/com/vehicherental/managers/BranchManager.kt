package com.vehicherental.managers

import com.vehicherental.dao.BranchDao
import com.vehicherental.dbmodels.Branch

class BranchManager(private val branchDao: BranchDao) {
    fun addBranch(branchName: String) {
        branchDao.save(Branch(branchName))
    }
}
